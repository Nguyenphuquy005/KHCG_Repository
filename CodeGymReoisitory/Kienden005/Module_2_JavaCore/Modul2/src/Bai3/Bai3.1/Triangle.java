package Bai3;

public class Triangle {
      double a ; double b ; double c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public Triangle(){
        a=1 ; b=1 ; c=1 ;
    }
    public Triangle(double a , double b , double c){
        this.a =a ; this.b =b ; this.c = c ;
    }
    public double getArea(){
        double p = 0.5*(this.a + this.b + this.c);
        return Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(0,0,0);
        System.out.println(triangle.getArea());
    }
}
