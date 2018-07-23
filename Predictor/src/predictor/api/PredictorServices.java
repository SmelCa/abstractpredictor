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
    
    IResult predictResult(List<IParticipant> participants, List<IResult> pastResults, IEventContext eventContext);
}
