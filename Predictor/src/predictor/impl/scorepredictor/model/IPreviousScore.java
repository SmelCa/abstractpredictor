/*
 *   Copyright(c) Clement Tourne.  All Rights Reserved. 
 *   This software is the proprietary information of Clement Tourne.
 */
package predictor.impl.scorepredictor.model;

import java.time.LocalDateTime;

public interface IPreviousScore {
    
    LocalDateTime getCompetitionTime();

    double getScore();
}
