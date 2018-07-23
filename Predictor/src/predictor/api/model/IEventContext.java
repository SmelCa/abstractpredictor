/*
 *   Copyright(c) Clement Tourne.  All Rights Reserved. 
 *   This software is the proprietary information of Clement Tourne.
 */
package predictor.api.model;

import java.time.LocalDateTime;
import java.util.Map;

public interface IEventContext {
    
    LocalDateTime eventDateTime();
    
    Map<String, String> eventAttributes();
}
