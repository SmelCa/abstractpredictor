/*
 *   Copyright(c) Clement Tourne.  All Rights Reserved. 
 *   This software is the proprietary information of Clement Tourne.
 */

package predictor.impl.scorepredictor.impl.predictoragent.impl;

import java.time.LocalDateTime;
import predictor.impl.scorepredictor.impl.predictoragent.PredictorAgentServices;
import predictor.impl.scorepredictor.impl.predictoragent.model.Contender;
import predictor.impl.scorepredictor.impl.predictoragent.model.PreviousScore;
import predictor.impl.model.PredictorAgentParameters;

public class AverageScoreAgentServicesImpl implements PredictorAgentServices{

    @Override
    public double predictParticipantScore(PredictorAgentParameters predictorAgentParameters, Contender contender, LocalDateTime competitionDate) {
        double sumOfPreviousScores = 0;
        for (PreviousScore contenderScore: contender.getPreviousScores()){
            sumOfPreviousScores += contenderScore.getScore();
        }
        
        double contenderAverageScore = sumOfPreviousScores / contender.getPreviousScores().size();
        
        return contenderAverageScore;   
    }
}
