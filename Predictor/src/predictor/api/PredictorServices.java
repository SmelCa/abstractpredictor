/*
 *   Copyright(c) Clement Tourne.  All Rights Reserved. 
 *   This software is the proprietary information of Clement Tourne.
 */
package predictor.api;

import java.util.List;
import predictor.api.model.EventContext;
import predictor.api.model.Participant;
import predictor.api.model.Result;

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
    Result predictResult(List<Participant> participants, List<Result> pastResults, EventContext eventContext);
}
