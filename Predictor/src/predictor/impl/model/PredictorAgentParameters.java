/*
 *   Copyright(c) Clement Tourne.  All Rights Reserved. 
 *   This software is the proprietary information of Clement Tourne.
 */
package predictor.impl.model;

public class PredictorAgentParameters {

    private final double firstParameter;
    
    private final double secondParameter;

    public PredictorAgentParameters(double firstParameter, double secondParameter) {
        this.firstParameter = firstParameter;
        this.secondParameter = secondParameter;
    }

    public double getFirstParameter() {
        return firstParameter;
    }

    public double getSecondParameter() {
        return secondParameter;
    }
}
