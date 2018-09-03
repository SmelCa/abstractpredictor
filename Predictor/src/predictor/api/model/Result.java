/*
 *   Copyright(c) Clement Tourne.  All Rights Reserved. 
 *   This software is the proprietary information of Clement Tourne.
 */
package predictor.api.model;

import java.util.Map;

public class Result {
    
    private final EventContext eventContext;
    
    private final Map<Participant, Double> participantScores;
    
    public Result(EventContext eventContext, Map<Participant, Double> participantScores){
        this.eventContext = eventContext;
        this.participantScores = participantScores;
    }

    public EventContext getEventContext() {
        return this.eventContext;    
    }

    public Map<Participant, Double> getParticipantScores() {
        return this.participantScores;
    }
}
