/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predictor.impl.scorepredictor.model;

import java.util.List;

/**
 *
 * @author Clément
 */
public interface IContender {
    
    long getId();

    String getName();

    List<? extends IPreviousScore> getPreviousScores();
}
