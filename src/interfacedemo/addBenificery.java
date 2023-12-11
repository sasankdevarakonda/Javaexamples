package interfacedemo;

public class addBenificery {
    int accountNumber;
    String name;



    public addBenificery(int accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name=name;
    }


    @Override
    public String toString() {
        return  "accountNumber: "+accountNumber+ " , "+"Name: "+name;
    }
}

