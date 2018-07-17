/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predictor.api;

import java.util.List;
import predictor.api.model.IParticipant;
import predictor.api.model.IResult;

/**
 *
 * @author Clément
 */
public interface PredictorServices {
    
    IResult predictResult(List<IParticipant> participants, List<IResult> pastResults);
}
