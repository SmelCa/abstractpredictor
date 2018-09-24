/*
 *   Copyright(c) Clement Tourne.  All Rights Reserved. 
 *   This software is the proprietary information of Clement Tourne.
 */
package predictor.impl.scorepredictor;

import java.util.List;
import java.util.Map;
import predictor.api.model.EventContext;
import predictor.api.model.Participant;
import predictor.api.model.Result;
import predictor.impl.model.PredictorAgentIdentifier;
import predictor.impl.model.PredictorAgentParameters;

public interface ScorePredictorServices {
    
    /**
     * Service to predict a score for each participants of an event.
     * Use several date for prediction:
     *  - the previous event results to predict
     * (possibly including results of the event participants or other participants)
     *  - the expected context of the event
     * 
     * @param predictionParameters
     *      the parameters of the trained prediction model by agent
     * @param participants
     *      the list of participants of the event
     * @param pastResults
     *      the past results in other events 
     * @param eventContext
     *      the list of context parameters of the event
     * @return the result, giving expected score for each participant
     */
    Result predictResult(Map<PredictorAgentIdentifier, PredictorAgentParameters> predictionParameters, List<Participant> participants, List<Result> pastResults,
            EventContext eventContext);
}
