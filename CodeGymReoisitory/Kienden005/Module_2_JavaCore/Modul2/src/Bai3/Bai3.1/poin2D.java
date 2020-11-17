package Bai3;

public class poin2D {
    private float x ;
    private float y ;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public poin2D(){
        x = 0.0f ;
        y= 0.0f ;
    }
    public poin2D(float x ,float y){
        this.x = x ;
        this.y = y ;
    }

    @Override
    public String toString() {
        return "X: " + this.x + " Y: " + this.y;
    }
}
