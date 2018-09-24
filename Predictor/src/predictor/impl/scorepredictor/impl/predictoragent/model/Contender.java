/*
 *   Copyright(c) Clement Tourne.  All Rights Reserved. 
 *   This software is the proprietary information of Clement Tourne.
 */
package predictor.impl.scorepredictor.impl.predictoragent.model;

import java.util.List;

public class Contender{
    
    private final long id;
    
    private final String name;
    
    private final List<PreviousScore> previousScores;

    public Contender(long id, String name, List<PreviousScore> previousScores) {
        this.id = id;
        this.name = name;
        this.previousScores = previousScores;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<PreviousScore> getPreviousScores() {
        return previousScores;
    }
}
