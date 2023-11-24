package templet;

import modules.BunkLocation;
import modules.OilTanks;
import modules.Pieps;

public abstract class BunkTemplate {
    abstract void Way();
    abstract void Price();
    abstract void Quantity();


    public final void  getbunk(){
        getbunklocation();
        getoiltank();
        getPipes();
        Way();
        Price();
        Quantity();

        System.out.println("Successfully Completed");
    }

    public OilTanks getoiltank(){
        return new OilTanks(15," cylindrical");
    }
    public Pieps getPipes(){
        return new Pieps(14.5,2.65);
    }
    public BunkLocation getbunklocation(){
        return new BunkLocation("Miyapur",3,"Indian Oil Bunk");
    }
}
