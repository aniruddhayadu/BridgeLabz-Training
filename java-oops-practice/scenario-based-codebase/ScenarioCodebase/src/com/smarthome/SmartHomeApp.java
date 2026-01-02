package com.smarthome;

public class SmartHomeApp {
    public static void main(String[] args) {

        Light livingRoomLight = new Light("Living Room", 60);
        Fan bedroomFan = new Fan("Bedroom", 75);
        AC hallAC = new AC("Hall", 1500, 24);

        UserController controller = new UserController();
        controller.addAppliance(livingRoomLight);
        controller.addAppliance(bedroomFan);
        controller.addAppliance(hallAC);

        controller.turnOnAll();
        hallAC.setTemperature(22); // change temp while AC is ON
        controller.comparePowerUsage();
        controller.turnOffAll();
    }
}
