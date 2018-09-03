/*
 *   Copyright(c) Clement Tourne.  All Rights Reserved. 
 *   This software is the proprietary information of Clement Tourne.
 */
package predictor.api.model;

import java.time.LocalDateTime;
import java.util.Map;

public class EventContext {
    
    private final LocalDateTime eventDateTime;
    
    private final Map<String, String> eventAttributes;
    
    public EventContext(LocalDateTime eventDateTime, Map<String, String> eventAttributes){
        this.eventDateTime = eventDateTime;
        this.eventAttributes = eventAttributes;
    }
    
    public LocalDateTime getEventDateTime(){
        return this.eventDateTime;
    }
    
    public Map<String, String> getEventAttributes(){
        return this.eventAttributes;
    }
}
