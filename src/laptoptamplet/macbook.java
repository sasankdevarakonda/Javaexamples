package laptoptamplet;

public class macbook extends accessories{
    public void laptops(){
        super.laptops();
        System.out.println("I buy Macbook Laptop.");
    }
    @Override
    public void company() {
        System.out.println("Company: Mackbook");
    }

    @Override
    public void product() {
        System.out.println("Product: Laptop");

    }

    @Override
    void color() {
        System.out.println("Color: White");

    }

    @Override
    void design() {
        System.out.println("Design: Gaming Design.");
    }
}
