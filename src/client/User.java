package client;

import modules.BunkLocation;
import templet.BunkTemplate;
import templet.Diesel;
import templet.Gas;
import templet.Petrol;

public class User {
    public static void main(String[]args){
        String userchoice="Petrol";
        System.out.println("User Choice: "+userchoice);
        BunkTemplate bunk=new Petrol();
        bunk.getbunk();
        System.out.println("BunkLocation: "+ bunk.getbunklocation());
        System.out.println("OilTank Type: "+bunk.getoiltank());
        System.out.println("PipeType: "+bunk.getPipes());
        System.out.println("**************************");

        String custmerchoice="Diesel";
        System.out.println("User Choice: "+custmerchoice);
        BunkTemplate diesel=new Diesel();
        diesel.getbunk();
        System.out.println("BunkLocation: "+ diesel.getbunklocation());
        System.out.println("OilTank Type: "+diesel.getoiltank());
        System.out.println("PipeType: "+diesel.getPipes());
        System.out.println("**************************");

        String user="Gas";
        System.out.println("User Choice: "+user);
        BunkTemplate gas=new Gas();
        gas.getbunk();
        System.out.println("BunkLocation: "+ gas.getbunklocation());
        System.out.println("OilTank Type: "+gas.getoiltank());
        System.out.println("PipeType: "+gas.getPipes());

    }
}
