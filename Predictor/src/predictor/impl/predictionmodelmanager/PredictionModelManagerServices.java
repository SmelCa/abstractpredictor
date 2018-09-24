/*
 *   Copyright(c) Clement Tourne.  All Rights Reserved. 
 *   This software is the proprietary information of Clement Tourne.
 */
package predictor.impl.predictionmodelmanager;

import predictor.impl.model.PredictorAgentIdentifier;
import predictor.impl.model.PredictorAgentParameters;

/**
 *
 * @author Clément
 */
public interface PredictionModelManagerServices {
    
    /**
     * Recover the predictor agent parameters of the trained model
     * 
     * @param predictorAgentIdentifier
     *      the identifier of the predictor agent to recover parameters
     * @return the agent current parameters
     */
    PredictorAgentParameters getPredictorAgentParameters(PredictorAgentIdentifier predictorAgentIdentifier);
}
