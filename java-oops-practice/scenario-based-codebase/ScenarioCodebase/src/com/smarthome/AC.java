package com.smarthome;

public class AC extends Appliance {

    private int temperature; // Encapsulation

    public AC(String name, int power, int temperature) {
        super(name, power);
        this.temperature = temperature;
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println(getName() + " AC is now ON. Cooling to " + temperature + "°C.");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println(getName() + " AC is now OFF.");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        if (isOn()) {
            System.out.println(getName() + " AC temperature set to " + temperature + "°C.");
        }
    }
}

