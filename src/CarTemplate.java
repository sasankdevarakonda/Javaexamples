import Model.Ac;
import Model.Control;
import Model.Engine;

public abstract class CarTemplate {
    abstract void WheelType();
    abstract void Colour();
    String engine;
    String ac;
    String control;

    public final void getcar() {
        getEngine();
        getAc();
        getControl();
        WheelType();
        Colour();
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



}


