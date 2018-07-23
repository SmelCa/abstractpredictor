/*
 *   Copyright(c) Clement Tourne.  All Rights Reserved. 
 *   This software is the proprietary information of Clement Tourne.
 */
package predictor.impl.scorepredictor;

import java.time.LocalDateTime;
import predictor.impl.model.Contender;

public interface ScorePredictorServices {
    
    double predictParticipantScore(Contender contender, LocalDateTime competitionDate);
}
