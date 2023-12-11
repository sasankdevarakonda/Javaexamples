package interfacedemo;

public class Sbi implements fundtransfer,fundValidation{
    
    @Override
    public void addValidation() {
        System.out.println("Sbi Validation verified successfully");

    }

    @Override
    public void addbenificiry() {
        System.out.println("Sbi AddBenificiry verified successfully");

    }

    @Override
    public void addTransfer() {
        System.out.println("Sbi Ammount Transsfer successfully");

    }
}
