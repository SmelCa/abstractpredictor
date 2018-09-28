/*
 *   Copyright(c) Clement Tourne.  All Rights Reserved. 
 *   This software is the proprietary information of Clement Tourne.
 */

package predictor.impl.predictionmodelmanager.impl;

import java.util.HashMap;
import java.util.Map;
import predictor.impl.model.PredictorAgentIdentifier;
import predictor.impl.model.PredictorAgentParameters;
import predictor.impl.predictionmodelmanager.PredictionModelManagerServices;

public class PredictionModelManagerServicesImpl implements PredictionModelManagerServices{
    
    private final Map<PredictorAgentIdentifier, PredictorAgentParameters> predictorAgentParameters; 
    
    public PredictionModelManagerServicesImpl(){
        //LOAD model from database or file
        this.predictorAgentParameters = new HashMap<>();
        this.predictorAgentParameters.put(PredictorAgentIdentifier.AVERAGE_SCORE, new PredictorAgentParameters(1, 1));
    }

    @Override
    public PredictorAgentParameters getPredictorAgentParameters(PredictorAgentIdentifier predictorAgentIdentifier) {
        return this.predictorAgentParameters.get(predictorAgentIdentifier);
    }
}
