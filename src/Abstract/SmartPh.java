package Abstract;

import Model.Camera;
import Model.DisplayScreen;
import Model.Hardware;
import Model.Software;

import java.awt.*;

public class SmartPh extends Mobiles{

    private Camera camera;
    private DisplayScreen displayScreen;
    private Hardware hardware;
    private Software software;

    public SmartPh(Camera camera, DisplayScreen displayScreen, Hardware hardware,Software software) {
        this.camera = camera;
        this.displayScreen = displayScreen;
        this.hardware = hardware;
        this.software=software;
    }
    public SmartPh(){

    }
    @Override
    public void MobileColor() {
        System.out.println("Color: Blue");
    }

    @Override
    public void MobileSim() {
        System.out.println("Sim: Jio");
    }


}
