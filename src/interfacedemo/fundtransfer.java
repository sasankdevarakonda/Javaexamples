package interfacedemo;

public interface fundtransfer {
 void addbenificiry();
 void addTransfer();

 /*default void getbank(){
  getBenificery();
  gettransfer();

 }*/

 default addBenificery getBenificery(){
  return new addBenificery(879097809,"SasankDevarakonda");

 }
 default addTransfer gettransfer(){
  return  new addTransfer(5055,879097809);
 }

}
