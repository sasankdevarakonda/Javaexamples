package laptoptamplet;

import laptopinterface.laptop;
import model.battery;
import model.display;

public abstract class accessories implements laptop{
    abstract void color();
    abstract void design();
    public void laptops(){
        System.out.println("Their is so many accessories are their.");
    }
    public final void getlaptop(){
        getbattery();
        getdisplay();
        color();
        design();
        company();
        product();

    }
    public battery getbattery(){
       return new battery(4500, "lenovo");

    }
    public display getdisplay(){

       return new display("Touch", 13, 7);
    }
}
