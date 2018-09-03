/*
 *   Copyright(c) Clement Tourne.  All Rights Reserved. 
 *   This software is the proprietary information of Clement Tourne.
 */
package predictor.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import predictor.api.PredictorServices;
import predictor.impl.scorepredictor.model.Contender;
import predictor.impl.scorepredictor.model.PreviousScore;
import predictor.impl.scorepredictor.ScorePredictorServices;
import predictor.api.model.EventContext;
import predictor.api.model.Participant;
import predictor.api.model.Result;

public class PredictorServicesImpl implements PredictorServices{
    
    private final ScorePredictorServices contenderAverageScorePredictorServices;
    
    public PredictorServicesImpl(ScorePredictorServices contenderAverageScorePredictorServices){
        this.contenderAverageScorePredictorServices = contenderAverageScorePredictorServices;
    }

    @Override
    public Result predictResult(List<Participant> participants, List<Result> pastResults, EventContext eventContext) {
        Map<Participant, Double> participantScores = new HashMap<>();
        
        for(Participant participant:participants){
            double participantScore = predictParticipantResult(participant, pastResults, eventContext);
            participantScores.put(participant, participantScore);
        }
        
        return new Result(eventContext, participantScores);
    }
    
    
    private double predictParticipantResult(Participant participant, List<Result> pastResults, EventContext eventContext){
        Contender contender = this.createContender(participant, pastResults);
        
        double averageResult = this.contenderAverageScorePredictorServices.predictParticipantScore(contender, eventContext.getEventDateTime());
        
        return averageResult;
    }
    
    private Contender createContender(Participant participant, List<Result> pastResults){
        long id = participant.getId();
        String name = participant.getName();
        List<PreviousScore> previousScores = new ArrayList<>();
        for(Result result : pastResults){
            for(Participant aParticipant: result.getParticipantScores().keySet()){
                if(aParticipant == participant){
                    double participantScore = result.getParticipantScores().get(participant);
                    previousScores.add(new PreviousScore(result.getEventContext().getEventDateTime(), participantScore));
                }
            }
        }
        
        return new Contender(id, name, previousScores);
    }
}