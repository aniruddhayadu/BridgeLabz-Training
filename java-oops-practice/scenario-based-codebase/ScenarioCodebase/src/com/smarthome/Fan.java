package com.smarthome;

public class Fan extends Appliance {

    public Fan(String name, int power) {
        super(name, power);
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println(getName() + " Fan is now ON. Speed set to medium.");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println(getName() + " Fan is now OFF.");
    }
}
