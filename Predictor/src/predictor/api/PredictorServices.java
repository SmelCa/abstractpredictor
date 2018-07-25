/*
 *   Copyright(c) Clement Tourne.  All Rights Reserved. 
 *   This software is the proprietary information of Clement Tourne.
 */
package predictor.api;

import java.util.List;
import predictor.api.model.IEventContext;
import predictor.api.model.IParticipant;
import predictor.api.model.IResult;

public interface PredictorServices {
    
    /**
     * Service to predict a score for each participants of an event.
     * Use several date for prediction:
     *  - the previous event results to predict
     * (possibly including results of the event participants or other participants)
     *  - the expected context of the event
     * 
     * @param participants
     *      the list of participants of the event
     * @param pastResults
     *      the past results in other events 
     * @param eventContext
     *      the list of context parameters of the event
     * @return the result, giving expected score for each participant
     */
    IResult predictResult(List<IParticipant> participants, List<IResult> pastResults, IEventContext eventContext);
}
