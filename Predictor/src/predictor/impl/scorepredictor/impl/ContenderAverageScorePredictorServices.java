/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predictor.impl.scorepredictor.impl;


import java.time.LocalDateTime;
import predictor.impl.scorepredictor.ScorePredictorServices;

import predictor.impl.model.Contender;
/**
 *
 * @author Clément
 */
public class ContenderAverageScorePredictorServices implements ScorePredictorServices{

    @Override
    public double predictParticipantScore(Contender contender, LocalDateTime competitionDate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
