/*
 *   Copyright(c) Clement Tourne.  All Rights Reserved. 
 *   This software is the proprietary information of Clement Tourne.
 */
package predictor.impl.scorepredictor.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import predictor.api.model.EventContext;
import predictor.api.model.Participant;
import predictor.api.model.Result;
import predictor.impl.model.PredictorAgentIdentifier;
import predictor.impl.model.PredictorAgentParameters;
import predictor.impl.scorepredictor.ScorePredictorServices;
import predictor.impl.scorepredictor.impl.predictoragent.PredictorAgentServices;
import predictor.impl.scorepredictor.impl.predictoragent.model.Contender;
import predictor.impl.scorepredictor.impl.predictoragent.model.PreviousScore;

public class ScorePredictorServicesImpl implements ScorePredictorServices{

    private final PredictorAgentServices averageScoreAgentServices;
    
    public ScorePredictorServicesImpl(PredictorAgentServices averageScoreAgentServices){
        this.averageScoreAgentServices = averageScoreAgentServices;
    }

    @Override
    public Result predictResult(Map<PredictorAgentIdentifier, PredictorAgentParameters> predictionParameters, List<Participant> participants, List<Result> pastResults,
            EventContext eventContext) {
        Map<Participant, Double> participantScores = new HashMap<>();
        
        for(Participant participant:participants){
            double participantScore = predictParticipantResult(predictionParameters, participant, pastResults, eventContext);
            participantScores.put(participant, participantScore);
        }
        
        return new Result(eventContext, participantScores);
    }
    
    
    private double predictParticipantResult(Map<PredictorAgentIdentifier, PredictorAgentParameters> predictionParameters, Participant participant, List<Result> pastResults,
            EventContext eventContext){
        Contender contender = this.createContender(participant, pastResults);
        
        PredictorAgentParameters averageScoreAgentParameters = predictionParameters.get(PredictorAgentIdentifier.AVERAGE_SCORE);
        double averageResult = this.averageScoreAgentServices.predictParticipantScore(averageScoreAgentParameters, contender, eventContext.getEventDateTime());
        
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
