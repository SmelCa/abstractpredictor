/*
 *   Copyright(c) Clement Tourne.  All Rights Reserved. 
 *   This software is the proprietary information of Clement Tourne.
 */
package predictor.api.model;

import java.util.Map;

public interface IResult {
    
    IEventContext getEventContext();
    
    Map<IParticipant, Double> getParticipantScores();
}
