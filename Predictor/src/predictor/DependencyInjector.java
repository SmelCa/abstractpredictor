/*
 *   Copyright(c) Clement Tourne.  All Rights Reserved. 
 *   This software is the proprietary information of Clement Tourne.
 */
package predictor;

import predictor.api.PredictorServices;
import predictor.impl.PredictorServicesImpl;
import predictor.impl.predictionmodelmanager.PredictionModelManagerServices;
import predictor.impl.predictionmodelmanager.impl.PredictionModelManagerServicesImpl;
import predictor.impl.scorepredictor.ScorePredictorServices;
import predictor.impl.scorepredictor.impl.ScorePredictorServicesImpl;
import predictor.impl.scorepredictor.impl.predictoragent.PredictorAgentServices;
import predictor.impl.scorepredictor.impl.predictoragent.impl.AverageScoreAgentServicesImpl;

public class DependencyInjector {
    
    public PredictorServices predictorServices(){
        return new PredictorServicesImpl(scorePredictorServices(), predictionModelManagerServices());
    }
    
    private ScorePredictorServices scorePredictorServices(){
        return new ScorePredictorServicesImpl(averageScoreAgentServices());
    }
    
     private PredictionModelManagerServices predictionModelManagerServices(){
        return new PredictionModelManagerServicesImpl();
    }
    
    private PredictorAgentServices averageScoreAgentServices(){
        return new AverageScoreAgentServicesImpl();
    }
   
}
