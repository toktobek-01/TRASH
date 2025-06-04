package practiceGpt.mainapp;

import practiceGpt.Vehicles.Vehicle;

public class Car extends Vehicle {
    @Override
    public void showType() {
        System.out.println("Showtype is called...");;
        System.out.println("Vehicle type:" + type);
    }


    private void internalCheck() {
        System.out.println("Cannot access internalCheck");
    }
}
