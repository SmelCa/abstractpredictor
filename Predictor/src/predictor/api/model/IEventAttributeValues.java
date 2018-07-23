/*
 *   Copyright(c) Clement Tourne.  All Rights Reserved. 
 *   This software is the proprietary information of Clement Tourne.
 */
package predictor.api.model;

import java.util.List;

public interface IEventAttributeValues {
    
    String attributeName();
    
    List<String> possibleValues();
}
