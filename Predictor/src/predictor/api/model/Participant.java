/*
 *   Copyright(c) Clement Tourne.  All Rights Reserved. 
 *   This software is the proprietary information of Clement Tourne.
 */
package predictor.api.model;

public class Participant {
    
    private final long id;
    
    private final String name;
    
    public Participant(long id, String name){
        this.id = id;
        this.name = name;
    }
    
    public long getId(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
}
