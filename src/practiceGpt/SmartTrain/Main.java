package practiceGpt.SmartTrain;

public class Main {
    public static void main(String[] args) {
        SmartTrain train = new SmartTrain();
        train.start();
        train.stop();
        train.charge();
        train.connectToWiFi();
        train.updateSoftware();
        train.openDoors();
    }
}
