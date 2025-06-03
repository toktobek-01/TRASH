package practiceGpt.SmartBus;

public class Main {
    public static void main(String[] args) {
        SmartBus bus = new SmartBus();
        bus.info();
        bus.start();
        bus.stop();
        bus.charge();
        bus.connectToWiFi();
        bus.updateSoftware();
    }
}
