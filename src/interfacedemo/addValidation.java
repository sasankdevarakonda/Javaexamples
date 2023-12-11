package interfacedemo;

public class addValidation {
    String userName;
    int password;





    public addValidation(String userName, int password) {
        this.userName = userName;
        this.password=password;
    }


    @Override
    public String toString() {
        return  "UserName: " +userName +" , "+ "Password: "+password ;
    }
}
