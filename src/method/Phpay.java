package method;

import upcasting.BankAccount;
import upcasting.Gpay;

public class Phpay extends BookMyshow{

    public void transfer(){
        System.out.println("Ammount Recived");
    }
    public static void main(String[]args){
       BookMyshow bankAccount= new Phpay();
        bankAccount.transferfmoney();

    }
}

//output:Transfer Successfully To Phpay
