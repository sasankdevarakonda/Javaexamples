package model;

public class display {
    String screenType;
    int screenLenght;
    int screenWidth;
    public display(String screenType, int screenLenght, int screenWidth) {
        this.screenType = screenType;
        this.screenLenght=screenLenght;
        this.screenWidth=screenWidth;
    }

    @Override
    public String toString() {
        return screenWidth+","+screenLenght+","+screenType+".";
    }
}
