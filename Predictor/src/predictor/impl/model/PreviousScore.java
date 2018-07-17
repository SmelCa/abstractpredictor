/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predictor.impl.model;

import java.time.LocalDateTime;
import predictor.impl.scorepredictor.model.IPreviousScore;

/**
 *
 * @author Clément
 */
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
