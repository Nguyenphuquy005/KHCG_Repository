public class test2 {
    public static void main(String args[]) {
        System.out.println(checkSNT(8));
    }
    public static  boolean checkSNT(int a){
        if (a <=1){
            return  false;
        }
        if (a ==2){
            return  true;
        }
        if (a>2){
            for (int i=2 ; i<a ; i++){
                if (a%i == 0){
                   return false ;
                }
            }
        }
        return true ;

    }
}
