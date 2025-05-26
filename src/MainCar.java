public class MainCar {
    public static void main(String[] args) {
        Cars myCar = new Car();
        myCar.start();
        myCar.stop();

        System.out.println();

        Cars myMotor = new Motorcycle();
        myMotor.start();
        myMotor.fuelType();
        myMotor.stop();

        System.out.println();

        Cars myBus = new Bus();
        myBus.start();
        myBus.stop();
        myBus.fuelType();
    }
}
