package Bai3;

public class XYspeed extends poin2D {
   private float xspeed;
    private float yspeed;

    public float getXspeed() {
        return xspeed;
    }

    public void setXspeed(float xspeed) {
        this.xspeed = xspeed;
    }

    public float getYspeed() {
        return yspeed;
    }

    public void setYspeed(float yspeed) {
        this.yspeed = yspeed;
    }
     public XYspeed() {
        super();
        xspeed =1 ;
        yspeed =1;
     }
     public XYspeed(float x , float y, float xspeed , float yspeed){
        this.setX(x);
        this.setY(y);
        this.xspeed = xspeed ;
        this.yspeed = yspeed ;
     }
     public float Xspeed(){
        return this.xspeed + getX();
     }
     public float Yspeed(){
        return this.yspeed + getY();
     }

    @Override
    public String toString() {
        return  "X " + getX()+ " Xspeed: " + Xspeed() + " Yspeed: " + Yspeed() ;
    }

    public static void main(String[] args) {
        poin2D xyspeed = new XYspeed(5,5,5,5);
//        ((poin2D)xyspeed).setX(1);
//        ((poin2D)xyspeed).setY(1);
        System.out.println(xyspeed.toString());
    }
}
