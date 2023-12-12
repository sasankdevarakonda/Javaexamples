package model;

public class battery {
    int capacity;
    String company;

    public battery(int capacity, String company) {
        this.capacity = capacity;
        this.company=company;
    }

    @Override
    public String toString() {
        return capacity+","+company+".";
    }
}
