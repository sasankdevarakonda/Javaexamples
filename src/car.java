import Model.Ac;
import Model.Control;
import Model.Engine;

public abstract class car {

        abstract void WheelType(String Wheel);
        abstract void Colour(String color);
        String engine;
        String ac;
        String control;

    public final void getcar() {
           getEngine();
           getAc();
           getControl();
           getWheeltype();
           getColour();

            System.out.println("Car Delivered to Client");
        }



        public Engine getEngine() {
            return new Engine(220, 12.65);
        }

        public Ac getAc() {
            return new Ac(1.5, "LG");
        }

        public Control getControl() {
            return new Control("disc brakes", 5);
        }
        public void getWheeltype(){
        System.out.println("Black Colour");
        }
        public void getColour(){
        System.out.println("Pressed Steel Disc Wheel");
        }


    void displayComponents() {
        System.out.println("Engine: " + engine);
        System.out.println("AC: " + ac);
        System.out.println("Control: " + control);
    }

}
