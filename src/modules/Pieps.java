package modules;

public class Pieps {
    public double lenght;
    public double width;

    public Pieps(double lenght,double width) {
        this.lenght = lenght;
        this.width=width;
    }
    public String toString() {
        return  lenght +"mm ln , " + width+"mm wd";
    }
}
