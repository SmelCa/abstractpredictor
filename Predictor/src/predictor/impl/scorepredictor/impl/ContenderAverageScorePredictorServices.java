/*
 *   Copyright(c) Clement Tourne.  All Rights Reserved. 
 *   This software is the proprietary information of Clement Tourne.
 */
package predictor.impl.scorepredictor.impl;


import java.time.LocalDateTime;
import predictor.impl.scorepredictor.ScorePredictorServices;

import predictor.impl.model.Contender;
import predictor.impl.model.PreviousScore;

public class ContenderAverageScorePredictorServices implements ScorePredictorServices{

    @Override
    public double predictParticipantScore(Contender contender, LocalDateTime competitionDate) {
        
        double sumOfPreviousScores = 0;
        for (PreviousScore contenderScore: contender.getPreviousScores()){
            sumOfPreviousScores += contenderScore.getScore();
        }
        
        double contenderAverageScore = sumOfPreviousScores / contender.getPreviousScores().size();
        
        return contenderAverageScore;
    }
}
