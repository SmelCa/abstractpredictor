/*
 *   Copyright(c) Clement Tourne.  All Rights Reserved. 
 *   This software is the proprietary information of Clement Tourne.
 */
package predictor.impl.model;

import java.util.Map;
import predictor.api.model.IEventContext;
import predictor.api.model.IParticipant;
import predictor.api.model.IResult;

public class Result implements IResult{
    
    private final IEventContext eventContext;
    
    private final Map<IParticipant, Double> participantScores;
    
    public Result(IEventContext eventContext, Map<IParticipant, Double> participantScores){
        this.eventContext = eventContext;
        this.participantScores = participantScores;
    }

    @Override
    public IEventContext getEventContext() {
        return this.eventContext;    
    }

    @Override
    public Map<IParticipant, Double> getParticipantScores() {
        return this.participantScores;
    }
}
