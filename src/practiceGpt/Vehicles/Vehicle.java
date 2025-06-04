package practiceGpt.Vehicles;

public class Vehicle {
    protected String type = "String type";
    public void showType() {
        System.out.println("Vehicle type:" + type );
    };
    private void internalCheck(){
        System.out.println("Performing internal check.");
    };
}
