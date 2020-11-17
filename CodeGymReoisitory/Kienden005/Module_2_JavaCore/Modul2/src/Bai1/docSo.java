import java.util.Scanner;

public class docSo {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.printf("Nhập n : ");
        int n;
        n = number.nextInt();
        int kt ;
        kt = n / 10;
        String[] num = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        String[] num2 = {"eleven", "twelve", "thirteen", "three", "fourteen", "fiveteen", "sixteen", "seventeen", "eightteen", "nineteen", "twenty"};
        if (n<0 || n>100){
            System.out.printf("out of ability");
        }
       if (n == 0){
           System.out.printf("zero");
       }
        if (n==100){
            System.out.printf("hundress");
        }
        for (int i = 0; i <= n; i++) {
            if (n >= 0 && n <= 10 && n == i) {
                System.out.printf(num[i]);
            } else if (n > 10 && n <= 20 && (n - 10) == i) {
                System.out.printf(num2[i]);
            } else if ((n > 20 && n < 30) && i == (n-20) ) {
                System.out.printf( "twenty " +num[i]);
            } else if ((n >= 30  && n < 40) && i == (n-30) ) {
                System.out.printf( "thirty " +num[i]);
            } else if ((n >= 40  && n < 50) && i == (n-40) ) {
                System.out.printf( "fourty " +num[i]);
            }else if ((n >= 50  && n < 60) && i == (n-50) ) {
                System.out.printf( "ninety " +num[i]);
            }else if ((n >= 60  && n < 70) && i == (n-60) ) {
                System.out.printf( "sixty " +num[i]);
            }else if ((n >= 70  && n < 80) && i == (n-70) ) {
                System.out.printf( "seventy " +num[i]);
            }else if ((n >= 80  && n < 90) && i == (n-80) ) {
                System.out.printf( "eightty " +num[i]);
            }else if ((n >= 90  && n < 100) && i == (n-90) ) {
                System.out.printf( "ninety " +num[i]);
            }
        }
    }
}
