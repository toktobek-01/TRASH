package practiceGpt.ElectriCar;

public class ElectricCar extends Vehicle implements Electric {
    @Override
    void start() {
        System.out.println("Electric car starts silently");
    }

    @Override
    void stop() {
        System.out.println("Electric car stops silently");
    }

    @Override
    public void charge() {
        System.out.println("Electric car charges");
    }

    @Override
    void color() {
        System.out.println("This car is red.");
    }

    @Override
    void power() {
        System.out.println("This car has 450 horsepower in it");
    }
}
