/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predictor.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import predictor.api.PredictorServices;
import predictor.api.model.IEventContext;
import predictor.api.model.IParticipant;
import predictor.api.model.IResult;
import predictor.impl.model.Contender;
import predictor.impl.model.PreviousScore;
import predictor.impl.model.Result;
import predictor.impl.scorepredictor.ScorePredictorServices;
import predictor.impl.scorepredictor.impl.ContenderAverageScorePredictorServices;

/**
 *
 * @author Clément
 */
public class PredictorServicesImpl implements PredictorServices{
    
    private final ScorePredictorServices contenderAverageScorePredictorServices;
    
    public PredictorServicesImpl(){
        this.contenderAverageScorePredictorServices = new ContenderAverageScorePredictorServices();
    }

    @Override
    public IResult predictResult(List<IParticipant> participants, List<IResult> pastResults, IEventContext eventContext) {
        Map<IParticipant, Double> participantScores = new HashMap<>();
        
        for(IParticipant participant:participants){
            double participantScore = predictParticipantResult(participant, pastResults, eventContext);
            participantScores.put(participant, participantScore);
        }
        
        return new Result(eventContext, participantScores);
    }
    
    
    private double predictParticipantResult(IParticipant participant, List<IResult> pastResults, IEventContext eventContext){
        Contender contender = this.createContender(participant, pastResults);
        
        double averageResult = this.contenderAverageScorePredictorServices.predictParticipantScore(contender, eventContext.eventDateTime());
        
        return averageResult;
    }
    
    private Contender createContender(IParticipant participant, List<IResult> pastResults){
        long id = participant.getId();
        String name = participant.getName();
        List<PreviousScore> previousScores = new ArrayList<>();
        for(IResult result : pastResults){
            for(IParticipant aParticipant: result.getParticipantScores().keySet()){
                if(aParticipant == participant){
                    double participantScore = result.getParticipantScores().get(participant);
                    previousScores.add(new PreviousScore(result.getEventContext().eventDateTime(), participantScore));
                }
            }
        }
        
        return new Contender(id, name, previousScores);
    }
}