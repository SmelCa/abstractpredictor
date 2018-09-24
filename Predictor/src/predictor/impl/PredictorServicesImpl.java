/*
 *   Copyright(c) Clement Tourne.  All Rights Reserved. 
 *   This software is the proprietary information of Clement Tourne.
 */
package predictor.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import predictor.api.PredictorServices;
import predictor.impl.scorepredictor.ScorePredictorServices;
import predictor.api.model.EventContext;
import predictor.api.model.Participant;
import predictor.api.model.Result;
import predictor.impl.model.PredictorAgentIdentifier;
import predictor.impl.model.PredictorAgentParameters;
import predictor.impl.predictionmodelmanager.PredictionModelManagerServices;

public class PredictorServicesImpl implements PredictorServices{
    
    private final ScorePredictorServices scorePredictorServices;
    private final PredictionModelManagerServices predictionModelManagerServices;

    
    public PredictorServicesImpl(ScorePredictorServices scorePredictorServices, PredictionModelManagerServices predictionModelManagerServices){
        this.scorePredictorServices = scorePredictorServices;
        this.predictionModelManagerServices = predictionModelManagerServices;
    }

    @Override
    public Result predictResult(List<Participant> participants, List<Result> pastResults, EventContext eventContext) {
        Map<PredictorAgentIdentifier, PredictorAgentParameters> predictionParameters = new HashMap<>();
        predictionParameters.put(PredictorAgentIdentifier.AVERAGE_SCORE, this.predictionModelManagerServices.getPredictorAgentParameters(PredictorAgentIdentifier.AVERAGE_SCORE));
        
        return this.scorePredictorServices.predictResult(predictionParameters, participants, pastResults, eventContext);
    }
}