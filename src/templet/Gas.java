package templet;

public class Gas extends BunkTemplate{
    @Override
    void Price() {
        System.out.println("Price: 350rp");
    }

    @Override
    void Quantity() {
        System.out.println("Quantity: 3.8kgs");

    }

    @Override
    void Way() {
        System.out.println("Go to right side the pump");

    }
}
