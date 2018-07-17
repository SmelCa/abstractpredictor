/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predictor.api.model;

import java.time.LocalDateTime;
import java.util.Map;

/**
 *
 * @author Clément
 */
public interface IResult {
    
    LocalDateTime getCompetitionTime();
    
    Map<IParticipant, Double> getParticipantScores();
}
