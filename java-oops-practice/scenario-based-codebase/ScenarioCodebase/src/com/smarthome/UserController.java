package com.smarthome;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    private List<Appliance> appliances;

    public UserController() {
        appliances = new ArrayList<>();
    }

    public void addAppliance(Appliance appliance) {
        appliances.add(appliance);
    }

    public void turnOnAll() {
        for (Appliance a : appliances) {
            a.turnOn();
        }
    }

    public void turnOffAll() {
        for (Appliance a : appliances) {
            a.turnOff();
        }
    }

    public void comparePowerUsage() {
        if (appliances.size() < 2) return;

        Appliance a1 = appliances.get(0);
        Appliance a2 = appliances.get(1);

        if (a1.usesMorePowerThan(a2)) {
            System.out.println(a1.getName() + " uses more power than " + a2.getName());
        } else if (a1.usesLessPowerThan(a2)) {
            System.out.println(a1.getName() + " uses less power than " + a2.getName());
        } else {
            System.out.println(a1.getName() + " uses the same power as " + a2.getName());
        }
    }
}
