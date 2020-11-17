public class Cricle extends Square implements Colorable,getArea ,Primiter{
    double r ;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Cricle(){};
    public Cricle(  String color , double r){
        super(color);

        this.r = r ;
    }
    @Override
    public double showArea(){
        return this.r*this.r*Math.PI;
    }
    @Override
    public double showPrimiter(){
        return this.r*Math.PI;
    }
    @Override
    public String howtocolor(){
        return "ht:   " + this.getShape() + " DT:  " +  showArea() + " CV: " + showPrimiter();
    }


}
