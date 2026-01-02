package com.smarthome;

public class Light extends Appliance {

    public Light(String name, int power) {
        super(name, power);
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println(getName() + " Light is now ON. Brightness adjusted.");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println(getName() + " Light is now OFF.");
    }
}
