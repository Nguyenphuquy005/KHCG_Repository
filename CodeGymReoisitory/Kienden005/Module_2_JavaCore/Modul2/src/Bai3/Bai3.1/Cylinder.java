package Bai3;

public class Cylinder extends Bai3.Cricle {
    private double cylinder;

    public void setCylinder(double cylinder) {
        this.cylinder = cylinder;
    }

    public double getCylinder() {
        return cylinder;
    }

    public Cylinder() {
        super();
    }

    public Cylinder(String color, double radius, double cylinder) {
        super();
        this.cylinder = cylinder;
    }

    public double getCylider() {
        return this.cylinder*getArea();
    }

    @Override
    public String toString(){
        return "color: " + this.getColor() + '\n' +  "Cylinder: " + getCylider();
    }
}
