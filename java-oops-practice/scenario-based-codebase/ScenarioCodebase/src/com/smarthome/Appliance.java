package com.smarthome;

public abstract class Appliance implements Controllable {
    private String name;       // Encapsulation
    private boolean isOn;
    protected int power;       // in watts

    // Constructor
    public Appliance(String name, int power) {
        this.name = name;
        this.power = power;
        this.isOn = false;     // default off
    }

    public String getName() {
        return name;
    }

    public boolean isOn() {
        return isOn;
    }

    // Protected setters for subclasses
    protected void setOn(boolean state) {
        this.isOn = state;
    }

    public int getPower() {
        return power;
    }

    // Compare energy usage (operators)
    public boolean usesMorePowerThan(Appliance other) {
        return this.power > other.power;
    }

    public boolean usesLessPowerThan(Appliance other) {
        return this.power < other.power;
    }

    public boolean usesSamePowerAs(Appliance other) {
        return this.power == other.power;
    }
}
