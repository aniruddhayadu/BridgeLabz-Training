package com.functionalInterfaces.cloningprototypeobjects;

public class Policy implements Cloneable {

    int policyId;
    String policyHolder;

    Policy(int policyId, String policyHolder) {
        this.policyId = policyId;
        this.policyHolder = policyHolder;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
