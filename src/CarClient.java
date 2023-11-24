import Model.Engine;

public class CarClient {
    public static void main(String[] args) {
            String userChoice = "BMW";
            System.out.println("Selected Car: " + userChoice);
            car Car = new FamilyCars();
            Car.getcar();
            System.out.println("************");
            Car = new ElectricVehicle();
            Car.getcar();
    }

}
