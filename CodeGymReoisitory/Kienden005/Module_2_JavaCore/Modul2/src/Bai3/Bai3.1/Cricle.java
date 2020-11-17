package Bai3;

public class Cricle {
    private String color;
    private double radius;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Cricle() {
        color = "green";
        radius = 1;
    }

    public Cricle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "color: " + this.color + '\n' + "Area: " + getArea();
    }
}
