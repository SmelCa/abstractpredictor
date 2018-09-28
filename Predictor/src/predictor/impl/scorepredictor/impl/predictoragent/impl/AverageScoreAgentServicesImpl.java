/*
 *   Copyright(c) Clement Tourne.  All Rights Reserved. 
 *   This software is the proprietary information of Clement Tourne.
 */

package predictor.impl.scorepredictor.impl.predictoragent.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import predictor.impl.scorepredictor.impl.predictoragent.PredictorAgentServices;
import predictor.impl.scorepredictor.impl.predictoragent.model.Contender;
import predictor.impl.scorepredictor.impl.predictoragent.model.PreviousScore;
import predictor.impl.model.PredictorAgentParameters;

/**
 * Into average score predictor agent parameters are used to:
 *  - First parameter is used to define the number of previous scores used to compute the score
 * (for example, with a value equals to 5, only the 5 last scores are used)
 *  - Second parameter is used to define the weight evolution between the first and the last score
 * (for example, with a value equals to 2, the last score has a the double weight of the first score. With 5
 * scores, the 3rd one has the average weight)
 */
public class AverageScoreAgentServicesImpl implements PredictorAgentServices{

    @Override
    public double predictParticipantScore(PredictorAgentParameters predictorAgentParameters, Contender contender, LocalDateTime competitionDate) {
        
        Map<PreviousScore, Double> previousScoresToUseWithCoefficients = usedPreviousScoresWithCoefficients(predictorAgentParameters, contender.getPreviousScores());
        
        double contenderAverageScore = 0;
        for(PreviousScore previousScoreToUse: previousScoresToUseWithCoefficients.keySet())
            contenderAverageScore += previousScoresToUseWithCoefficients.get(previousScoreToUse)* previousScoreToUse.getScore();
        
        return contenderAverageScore;   
    }
    
    
    private Map<PreviousScore, Double> usedPreviousScoresWithCoefficients(PredictorAgentParameters predictorAgentParameters, List<PreviousScore> previousScores){
        //TODO manage potential exceptions without or with only one score to use
        List<PreviousScore> previousScoresToUse = usedPreviousScores(predictorAgentParameters.getFirstParameter(), previousScores);
        
        double coefficientEvolutionGradient = (predictorAgentParameters.getSecondParameter() -1) / (previousScoresToUse.size() -1);
        
        Map<PreviousScore, Double> previousScoresToUseWithCoefficients = new HashMap<>();
        for (int i=0 ; i<previousScoresToUse.size(); i++){
            double coefficient = coefficientEvolutionGradient * i + 1;
            previousScoresToUseWithCoefficients.put(previousScoresToUse.get(i), coefficient);
        }
        return previousScoresToUseWithCoefficients;
    }
    
    private List<PreviousScore> usedPreviousScores(double firstAgentParameter, List<PreviousScore> previousScores){
        Long roundedFirstAgentParameter = Math.round(firstAgentParameter);
        
        int numberOfScoresToUse = roundedFirstAgentParameter.intValue();
        
        int firstScoreToUse = Math.max(0, previousScores.size() - numberOfScoresToUse);
        
        List<PreviousScore> previousScoresToUse = new ArrayList<>();
        for (int i=firstScoreToUse; i<previousScores.size(); i++)
            previousScoresToUse.add(previousScores.get(i));
        
        return previousScoresToUse;
    }
}
