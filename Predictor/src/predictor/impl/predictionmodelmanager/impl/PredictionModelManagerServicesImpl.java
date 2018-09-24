/*
 *   Copyright(c) Clement Tourne.  All Rights Reserved. 
 *   This software is the proprietary information of Clement Tourne.
 */

package predictor.impl.predictionmodelmanager.impl;

import predictor.impl.model.PredictorAgentIdentifier;
import predictor.impl.model.PredictorAgentParameters;
import predictor.impl.predictionmodelmanager.PredictionModelManagerServices;

public class PredictionModelManagerServicesImpl implements PredictionModelManagerServices{

    @Override
    public PredictorAgentParameters getPredictorAgentParameters(PredictorAgentIdentifier predictorAgentIdentifier) {
        //TODO set implementation
        return new PredictorAgentParameters(1, 1);
    }
}
