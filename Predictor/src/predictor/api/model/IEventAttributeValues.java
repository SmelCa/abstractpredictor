/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predictor.api.model;

import java.util.List;

/**
 *
 * @author Clément
 */
public interface IEventAttributeValues {
    
    String attributeName();
    
    List<String> possibleValues();
}