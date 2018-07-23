/*
 *   Copyright(c) Clement Tourne.  All Rights Reserved. 
 *   This software is the proprietary information of Clement Tourne.
 */
package predictor.impl.model;

import java.util.List;
import predictor.impl.scorepredictor.model.IContender;

public class Contender implements IContender{
    
    private final long id;
    
    private final String name;
    
    private final List<PreviousScore> previousScores;

    public Contender(long id, String name, List<PreviousScore> previousScores) {
        this.id = id;
        this.name = name;
        this.previousScores = previousScores;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<PreviousScore> getPreviousScores() {
        return previousScores;
    }
}
