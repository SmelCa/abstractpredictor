/*
 *   Copyright(c) Clement Tourne.  All Rights Reserved. 
 *   This software is the proprietary information of Clement Tourne.
 */
package predictor.impl.scorepredictor.model;

import java.util.List;

public interface IContender {
    
    long getId();

    String getName();

    List<? extends IPreviousScore> getPreviousScores();
}
