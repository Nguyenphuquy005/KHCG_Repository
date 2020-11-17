import java.util.Scanner;

public class KTNamNhuan {
    public static void main(String[] args) {
        Scanner tv = new Scanner(System.in);
        System.out.printf("Nhập n: ");
        int n;
        n = tv.nextInt();
        if(n<2){
            System.out.printf(n+" không phải là số nt ");
        }else if (n==2){
            System.out.printf( n+" là sô nt");
        }else {
            for (int i=2;i<n;i++){
                if (n%i==0){
                    System.out.printf(n+" không pl snt");
                }else {
                    System.out.printf(n+" là snt");
                }
            }
        }
    }
}
