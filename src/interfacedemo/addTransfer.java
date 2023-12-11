package interfacedemo;

public class addTransfer {
    int amount;
    int ToAccountNumber;

    public addTransfer(int amount,int ToAccountNumber) {
        this.amount = amount;
        this.ToAccountNumber=ToAccountNumber;
    }


    @Override
    public String toString() {
        return "Amount: "+amount+" , "+"ToAccountNumber: "+ToAccountNumber;
    }
}
