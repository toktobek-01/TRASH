package practiceGpt.Vehicles;

public class UserVehicles {
    private String name;
    private String fuelType;

    public void setName(String name) {
        this.name = name;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void showInfo() {
        System.out.println("Your " + name + " runs on " + fuelType + ".");
    }

    public void start() {
        System.out.println(name + " is starting ...");
    }

    public void stop() {
        System.out.println(name + " has stopped.");
    }
}
