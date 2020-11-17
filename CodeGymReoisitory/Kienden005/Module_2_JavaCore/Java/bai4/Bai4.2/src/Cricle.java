public class Cricle extends Shape implements Resizeable {
    double r ;
    Cricle(){
        r=1;
    }
    public Cricle(double r){
        this.r = r ;
    }
      @Override
      public String showShape(){
          return "bán kính " + this.r ;
      }
      @Override
    public String ShowRes(){
          return  "sau khi thay đổi: " + (r+1) ;
      }

    public static void main(String[] args) {
        Shape cr1 = new Cricle(4);
        System.out.println(cr1.showShape());
         Resizeable cr1_1 = (Cricle) cr1 ;
        System.out.println(cr1_1.ShowRes());

    }
}
