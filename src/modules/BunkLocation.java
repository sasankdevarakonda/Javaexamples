package modules;

public class BunkLocation {
    public String Area;
    public int RoadNo;
    public String BunkName;

    public BunkLocation(String area,int RoadNo,String BunkName) {
       this.Area = area;
       this.BunkName=BunkName;
       this.RoadNo=RoadNo;
    }
    public String toString() {
        return  Area + " Area ," +" Road No "+ RoadNo +", "+BunkName;
    }
}
