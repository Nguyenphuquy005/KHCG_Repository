public class Square implements Colorable {
    String shape ;

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public Square(){
    }
    public  Square(String x){
        this.shape = x ;
    }
    @Override
    public String howtocolor(){
        return this.shape + "" + color;
    }
}
