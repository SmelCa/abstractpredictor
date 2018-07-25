/*
 *   Copyright(c) Clement Tourne.  All Rights Reserved. 
 *   This software is the proprietary information of Clement Tourne.
 */
package predictor.impl.scorepredictor;

import java.time.LocalDateTime;
import predictor.impl.model.Contender;

public interface ScorePredictorServices {
    
    /**
     * Try to predict the score of a contender into a competition.
     * Use a simple statistic approach to compute the expected score
     * 
     * @param contender
     *      the contender to predict the score
     * @param competitionDate
     *      the date of the competition
     * @return the expected competition score of the contender
     */
    double predictParticipantScore(Contender contender, LocalDateTime competitionDate);
}
