/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predictor.impl;

import java.util.List;
import predictor.api.PredictorServices;
import predictor.api.model.IParticipant;
import predictor.api.model.IResult;
import predictor.impl.scorepredictor.ScorePredictorServices;
import predictor.impl.scorepredictor.impl.ContenderAverageScorePredictorServices;

/**
 *
 * @author Clément
 */
public class PredictorServicesImpl implements PredictorServices{
    
    private final ScorePredictorServices contenderAverageScorePredictorServices;
    
    public PredictorServicesImpl(){
        this.contenderAverageScorePredictorServices = new ContenderAverageScorePredictorServices();
    }

    @Override
    public IResult predictResult(List<IParticipant> participants, List<IResult> pastResults) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
