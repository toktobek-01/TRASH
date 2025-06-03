package practiceGpt.SmartBus;

import practiceGpt.Bus.SmartDevice;
import practiceGpt.ElectriCar.Electric;

public class SmartBus extends Vehicle implements Electric, SmartDevice {
    @Override
    public void start() {
        System.out.println("SmartBus is starting its route");
    }
    @Override
    public void stop() {
        System.out.println("SmartBus has reached the station");
    }
    @Override
    public void charge() {
        System.out.println("SmarBUs charges with electricity.");
    }

    @Override
    public void connectToWiFi() {
        System.out.println("SmartBus is connected to WiFi");

    }

    @Override
    public void updateSoftware() {
        System.out.println("SmartBus software updated");
    }
}
