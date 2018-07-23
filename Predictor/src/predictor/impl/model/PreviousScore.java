/*
 *   Copyright(c) Clement Tourne.  All Rights Reserved. 
 *   This software is the proprietary information of Clement Tourne.
 */
package predictor.impl.model;

import java.time.LocalDateTime;
import predictor.impl.scorepredictor.model.IPreviousScore;

public class PreviousScore implements IPreviousScore{
    final LocalDateTime competitionTime;

    final double score;

    public PreviousScore(LocalDateTime competitionTime, double score) {
        this.competitionTime = competitionTime;
        this.score = score;
    }

    public LocalDateTime getCompetitionTime() {
        return competitionTime;
    }

    public double getScore() {
        return score;
    }
}
