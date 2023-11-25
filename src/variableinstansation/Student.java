package variableinstansation;

public class Student extends Teacher{
    int age = 25;
    String name="Sasank";
    public static void main(String[]args){
    Teacher teacher = new Student();
    Student St =new Student();
    Teacher tc=new Teacher();
        System.out.println("Print Age: "+tc.age);
        System.out.println("Print Name: "+teacher.name);
        System.out.println("Print Age: "+St.age);
    }

}
//out put:
//Print Age: 54
//Print Name: Rahul
//Print Age: 25
