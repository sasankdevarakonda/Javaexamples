import Model.Engine;

public class CarClient {
    public static void main(String[] args) {
            String userChoice = "BMW";
            System.out.println("Selected Car: " + userChoice);
            CarTemplate Car = new FamilyCars();
            Car.getcar();
            System.out.println("Engine: " + Car.getEngine());
            System.out.println("AC: " + Car.getAc());
            System.out.println("Control: " + Car.getControl());
            System.out.println("*****************************");
            String UserChoice = "Inova";
            System.out.println("Selected Car: " + UserChoice);
            CarTemplate cars = new ElectricVehicle();
            cars.getcar();
            System.out.println("Engine: " + Car.getEngine());
            System.out.println("AC: " + Car.getAc());
            System.out.println("Control: " + Car.getControl());

    }

}
