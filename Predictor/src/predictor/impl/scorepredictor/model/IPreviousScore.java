/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predictor.impl.scorepredictor.model;

import java.time.LocalDateTime;

/**
 *
 * @author Clément
 */
public interface IPreviousScore {
    
    LocalDateTime getCompetitionTime();

    double getScore();
}
