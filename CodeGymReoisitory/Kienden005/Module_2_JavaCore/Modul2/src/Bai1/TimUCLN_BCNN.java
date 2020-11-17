package Bai1;

import java.util.Scanner;

public class TimUCLN_BCNN {
    public static void main(String[] args) {
        Scanner tim = new Scanner(System.in);
        System.out.printf("Nhập a: ");
        int a;
        a = tim.nextInt();
        System.out.printf("Nhập b: ");
        int b;
        b = tim.nextInt();
        int c ;
        c=0 ;
        for (int i =1 ; i<=a*b;i++){

            if (i%a==0 && i%b==0){
                c=i ;
                break;
            }
        }
        System.out.printf("UCLN của a,b là : " + a*b/c );
    }
}
