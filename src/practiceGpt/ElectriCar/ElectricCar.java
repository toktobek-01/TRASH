package practiceGpt.ElectriCar;

public class ElectricCar extends Vehicle implements Electric {
    @Override
    public void start() {
        System.out.println("Electric car starts silently");
    }

    @Override
    public void stop() {
        System.out.println("Electric car stops silently");
    }

    @Override
    public void charge() {
        System.out.println("Electric car charges");
    }

    @Override
    public void color() {
        System.out.println("This car is red.");
    }

    @Override
    public void power() {
        System.out.println("This car has 450 horsepower in it");
    }
}
