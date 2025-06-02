package practiceGpt.Bus;

public class SmartTruck extends Vehicle implements SmartDevice{
    @Override
    void start() {
        System.out.println("Smart Truck started silently.");
    }

    @Override
   void stop() {
       System.out.println("Smart Truck stopped");
   }

    @Override
    public void connectToWiFi() {
        System.out.println("SmartTruck connected to Wi-Fi.");
    }

    @Override
    public void updateSoftware() {
        System.out.println("SmartTruck updated software.");
    }
}
