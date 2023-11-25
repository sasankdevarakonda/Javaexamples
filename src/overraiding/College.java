package overraiding;

public class College extends University{
    String Namme="Mallareddy";


    public void student() {
      System.out.println("Going to College");
    }
    public static void main(String[]args){
        College us= new College();
        us.student();
        System.out.println("Name: "+us.Name);
    }
}
//output:Going to College
//       Name: Parul
