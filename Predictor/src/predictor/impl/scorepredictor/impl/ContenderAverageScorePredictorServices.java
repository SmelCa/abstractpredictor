/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predictor.impl.scorepredictor.impl;


import java.time.LocalDateTime;
import predictor.impl.scorepredictor.ScorePredictorServices;

import predictor.impl.model.Contender;
import predictor.impl.model.PreviousScore;
/**
 *
 * @author Clément
 */
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
