package Bai3;

public class Poin3d extends Bai3.poin2D {
    float z ;

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public Poin3d(){
        super();
        z=1;
    }
    public Poin3d(float z){
        super();
        this.z = z;
    }
    @Override
    public String toString() {
        return "X: " + getX() + " Y: " + getY() + " Z: " + this.z;
    }

    public static void main(String[] args) {
        Bai3.poin2D xyz = new Poin3d(4);
        ((Poin3d)xyz).setX(4);
        System.out.println(xyz.toString());
    }
}
