package templet;

public class Diesel extends BunkTemplate{
    @Override
    public void Price() {
        System.out.println("Price: 300rp");

    }

    @Override
    public void Quantity() {
        System.out.println("Quantity: 2.58L");

    }

    @Override
    public void Way() {
        System.out.println("Go to left side the fuel pump");
    }
}
