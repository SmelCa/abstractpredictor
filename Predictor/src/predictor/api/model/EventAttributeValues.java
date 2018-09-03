/*
 *   Copyright(c) Clement Tourne.  All Rights Reserved. 
 *   This software is the proprietary information of Clement Tourne.
 */
package predictor.api.model;

import java.util.List;

public class EventAttributeValues {
    
    private final String attributeName;
    
    private final List<String> possibleValues;
    
    public EventAttributeValues(String attributeName, List<String> possibleValues){
        this.attributeName = attributeName;
        this.possibleValues = possibleValues;
    }
    
    String getAttributeName(){
        return this.attributeName;
    }
    
    List<String> getPossibleValues(){
        return this.possibleValues;
    }
}
