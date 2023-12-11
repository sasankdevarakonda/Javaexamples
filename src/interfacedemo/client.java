package interfacedemo;

public class client {
    public static void main(String[]args){
        fundtransfer FTCity = new CityBank();
        System.out.println("CityBenificery:- "+FTCity.getBenificery());
        System.out.println("CityTransfer:- "+ FTCity.gettransfer());
        FTCity.addbenificiry();
        FTCity.addTransfer();
        //FTCity.getbank();
        System.out.println("************************************");
        fundValidation FVSbi = new Sbi();
        fundtransfer FTSbi = new Sbi();
        System.out.println("SbiBenificery:- "+ FTSbi.getBenificery());
        System.out.println("SbiValidation:- "+FVSbi.getValidation());
        System.out.println("SbiTransfer:- "+ FTSbi.gettransfer());
        FTSbi.addbenificiry();
        FVSbi.addValidation();
        FTSbi.addTransfer();
        //FTSbi.getbank();
        System.out.println("************************************");
        fundValidation FVHdfc = new Hdfc();
        fundtransfer FTHdfc = new Hdfc();
        System.out.println("HDFCBenificery:- "+ FTHdfc.getBenificery());
        System.out.println("HDFCValidation:- "+FVHdfc.getValidation());
        System.out.println("HDFCTransfer:- "+ FTHdfc.gettransfer());
        FTHdfc.addbenificiry();
        FVHdfc.addValidation();
        FTHdfc.addTransfer();
        //FTHdfc.getbank();

    }

}
