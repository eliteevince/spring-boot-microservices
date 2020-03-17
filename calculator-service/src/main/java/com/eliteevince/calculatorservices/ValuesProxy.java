package com.eliteevince.calculatorservices;

public class ValuesProxy {

    public Double getValueA() {
        return valueA;
    }

    public void setValueA(Double valueA) {
        this.valueA = valueA;
    }

    public Double getValueB() {
        return valueB;
    }

    public void setValueB(Double valueB) {
        this.valueB = valueB;
    }

    private Double valueA;
    private Double valueB;

    public ValuesProxy() {
    }

    public ValuesProxy(Double valueA, Double valueB) {
        this.valueA = valueA;
        this.valueB = valueB;
    }

    
}
