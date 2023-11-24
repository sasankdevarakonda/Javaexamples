package modules;

public class OilTanks {
    public int Height;
    public String Shape;

    public OilTanks(int height,String shape) {
       this.Height = height;
       this.Shape = shape;
    }
    public String toString() {
        return Height+ "ft height ,"+ Shape +" shape";
    }
}
