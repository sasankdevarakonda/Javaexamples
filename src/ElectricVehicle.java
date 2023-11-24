import Model.Ac;
import Model.Control;
import Model.Engine;

public class ElectricVehicle extends CarTemplate{

    private Engine engine;
    private Ac ac;
    private Control control;

    ElectricVehicle(Engine engine, Ac ac, Control control) {
        this.engine = engine;
        this.ac = ac;
        this.control = control;
    }

    public ElectricVehicle () {


    }

    @Override
    public void WheelType() {

        System.out.println("Pressed Steel Disc Wheel");
    }

    @Override
    public void Colour() {
        System.out.println("Red Colour");
    }



}
