public class Retange extends Square implements Colorable,getArea ,Primiter{
    double a;
    double b;
    public Retange(){};
    public Retange(String color , double a ,double b){
        super(color);
        this.a = a ;
        this.b = b ;
    }
    @Override
    public double showArea(){
        return this.a*this.b;
    }
    @Override
    public double showPrimiter(){
        return (this.a+this.b)*2;
    }
    @Override
    public String howtocolor(){
        return "ht:   " +  getShape() + " DT:  " +  showArea() + " CV: " + showPrimiter();
    }


}

