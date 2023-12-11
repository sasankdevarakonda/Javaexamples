package interfacedemo;

public class Hdfc implements fundtransfer,fundValidation{
    @Override
    public void addValidation() {
        System.out.println("Hdfc Validation verified successfully");

    }

    @Override
    public void addbenificiry() {
        System.out.println("Hdfc AddBenificiry verified successfully");
    }

    @Override
    public void addTransfer() {
        System.out.println("Hdfc Ammount Transsfer successfully");
    }
}
