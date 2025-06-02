package practiceGpt.GPS;

public class SmartCar implements GPS, MusicSystems {
    @Override
    public void navigate() {
        System.out.println("Navigate to your destination via GPS.");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing your favorite musi playlist.");
    }

    public void startEngine() {
        System.out.println("SmartCar engine started.");
    }
}
