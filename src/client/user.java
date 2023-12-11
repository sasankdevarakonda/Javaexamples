package client;

import module.hdfc;
import module.icici;

public class user {
    public static void main(String [] args){
        icici ic =new icici();
        ic.addBeneficiary(678489379,"SasankDevarakonda");
        ic.transfer(678489379,5000);
        hdfc hd =new hdfc();
        hd.otpValidation(6669,"hdfcclient@0206");
        hd.addBeneficiary(356789,"sasank");
        hd.transfer(878738,8899);



    }
}
