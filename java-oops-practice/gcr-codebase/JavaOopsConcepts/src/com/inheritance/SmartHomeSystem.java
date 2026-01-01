package com.inheritance;

public class SmartHomeSystem {
    public static void main(String[] args) {

        Thermostat thermostat = new Thermostat("TH-101", true, 22.5);
        thermostat.displayStatus();
    }
}

