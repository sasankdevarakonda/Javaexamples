import Model.Ac;
import Model.Control;
import Model.Engine;

public class FamilyCars extends CarTemplate{
        private Engine engine;
        private Ac ac;
        private Control control;


  FamilyCars(Engine engine, Ac ac, Control control) {
        this.engine = engine;
        this.ac = ac;
        this.control = control;
    }
    public FamilyCars() {
    }



    @Override
       public void WheelType() {
            System.out.println("Drum Type");
        }

        @Override
        public void Colour() {
            System.out.println("Black Colour");
        }

    }
