/*
 *   Copyright(c) Clement Tourne.  All Rights Reserved. 
 *   This software is the proprietary information of Clement Tourne.
 */
package predictor.impl.scorepredictor.impl.predictoragent;

import java.time.LocalDateTime;
import predictor.impl.scorepredictor.impl.predictoragent.model.Contender;
import predictor.impl.model.PredictorAgentParameters;

public interface PredictorAgentServices {
    
    /**
     * Try to predict the score of a contender into a competition.
     * Use a simple statistic approach to compute the expected score
     * 
     * @param predictorAgentParameters
     *      the parameters to apply with the predictor agent according to trained model
     * @param contender
     *      the contender to predict the score
     * @param competitionDate
     *      the date of the competition
     * @return the expected competition score of the contender
     */
    double predictParticipantScore(PredictorAgentParameters predictorAgentParameters, Contender contender, LocalDateTime competitionDate);
}
