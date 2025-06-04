package practiceGpt.SmartTrain;

import practiceGpt.Bus.SmartDevice;
import practiceGpt.ElectriCar.Electric;
import practiceGpt.SmartBus.Vehicle;

public class SmartTrain extends Vehicle implements Electric, SmartDevice {

    public void openDoors(){
        System.out.println("SmartTrain doors are open now.");
    }

    @Override
    public void start() {
        System.out.println("SmartTrain is leaving the station.");
    }

    @Override
    public void stop() {
        System.out.println("SmartTrain has arrived at destination.");

    }

    @Override
    public void charge() {
        System.out.println("SmartTrain is charging at the platform.");
    }

    @Override
    public void connectToWiFi() {
        System.out.println("SmartTrain WiFi connection successful.");
    }

    @Override
    public void updateSoftware() {
        System.out.println("SmartTrain system updated.");
    }
}

