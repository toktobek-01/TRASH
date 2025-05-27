public class MainCar {
    public static void main(String[] args) {
        Cars[] garage = {
                new Car(),
                new Motorcycle(),
                new Bus(),
                new ElectricCar()
        };

        for (Cars vehicle : garage) {
            vehicle.start();
            vehicle.fuelType();
            vehicle.stop();
            System.out.println();
        }
    }
}
