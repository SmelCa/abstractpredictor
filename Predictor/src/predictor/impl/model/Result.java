/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predictor.impl.model;

import java.time.LocalDateTime;
import java.util.Map;
import predictor.api.model.IParticipant;
import predictor.api.model.IResult;

/**
 *
 * @author Clément
 */
public class Result implements IResult{
    
    private final LocalDateTime localDateTime;
    
    private final Map<IParticipant, Double> participantScores;
    
    public Result(LocalDateTime localDateTime, Map<IParticipant, Double> participantScores){
        this.localDateTime = localDateTime;
        this.participantScores = participantScores;
    }

    @Override
    public LocalDateTime getCompetitionTime() {
        return this.localDateTime;    
    }

    @Override
    public Map<IParticipant, Double> getParticipantScores() {
        return this.participantScores;
    }
}
