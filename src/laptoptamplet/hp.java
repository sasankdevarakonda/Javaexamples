package laptoptamplet;

public class hp extends accessories{
    public void laptops(){
        super.laptops();
        System.out.println("I buy hp laptop.");

    }
    @Override
    public void company() {
        System.out.println("Company: HP pavilion");
    }

    @Override
    public void product() {
        System.out.println("Product: Laptop");

    }

    @Override
    void color() {
        System.out.println("Color: Black");

    }

    @Override
    void design() {
        System.out.println( "Design: Graphic Design.");

    }
}
