package upcasting;

public class Gpay extends  BankAccount{
    public int age=45;
    public void transfer(){
        System.out.println("Transfer Successfully To Gpay");
    }
    public static void main(String[]args){
        BankAccount bankAccount=new Gpay();
        bankAccount.transfer();
        System.out.println("Print Age: "+bankAccount.age);
    }
}
//output:Transfer Successfully To Gpay
//       Print Age: 10
