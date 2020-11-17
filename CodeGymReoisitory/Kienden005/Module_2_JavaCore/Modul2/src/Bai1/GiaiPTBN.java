import java.util.Scanner;

public class GiaiPTBN {
    public static void main(String[] args) {
        Scanner ptbn = new Scanner(System.in);
        System.out.printf("Nhập a : ");
        float a ;
        a = ptbn.nextFloat();
        System.out.printf("Nhập b : ");
        float b ;
        b = ptbn.nextFloat();
        if (a == 0 && b==0){
            System.out.println("Pt vô số nghiệm");
        }else if(a == 0 && b != 0 ){
            System.out.println("Pt vô nghiệm");
        }else {
            System.out.println( -b/a);
        }
    }
}
