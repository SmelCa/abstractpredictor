/*
 *   Copyright(c) Clement Tourne.  All Rights Reserved. 
 *   This software is the proprietary information of Clement Tourne.
 */
package predictor.impl.scorepredictor.impl.predictoragent.model;

import java.time.LocalDateTime;

public class PreviousScore{
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
