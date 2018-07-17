/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predictor.impl.scorepredictor;

import java.time.LocalDateTime;
import predictor.impl.model.Contender;

/**
 *
 * @author Clément
 */
public interface ScorePredictorServices {
    
    double predictParticipantScore(Contender contender, LocalDateTime competitionDate);
}
