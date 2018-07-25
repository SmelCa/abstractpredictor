/*
 *   Copyright(c) Clement Tourne.  All Rights Reserved. 
 *   This software is the proprietary information of Clement Tourne.
 */
package predictor;

import predictor.api.PredictorServices;
import predictor.impl.PredictorServicesImpl;
import predictor.impl.scorepredictor.ScorePredictorServices;
import predictor.impl.scorepredictor.impl.ContenderAverageScorePredictorServices;

public class DependencyInjector {
    
    public static PredictorServices predictorServices(){
        return new PredictorServicesImpl(contenderAverageScorePredictorServices());
    }
    
    private static ScorePredictorServices contenderAverageScorePredictorServices(){
        return new ContenderAverageScorePredictorServices();
    }
}
