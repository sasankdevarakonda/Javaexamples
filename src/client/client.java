package client;

import laptoptamplet.accessories;
import laptoptamplet.hp;
import laptoptamplet.macbook;

public class client {
    public static void main (String[]args){
         hp ac = new hp();
         ac.laptops();
         ac.getlaptop();
         System.out.println("*************************");
         accessories acm=new macbook();
         acm.laptops();
         acm.getlaptop();
    }
}
