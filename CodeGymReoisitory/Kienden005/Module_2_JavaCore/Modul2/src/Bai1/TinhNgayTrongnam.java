import java.util.Scanner;

public class TinhNgayTrongnam {
    public static void main(String[] args) {
        Scanner day = new Scanner(System.in);
        System.out.printf("Nhập tháng: ");
        int t;
        t = day.nextInt();
        System.out.printf("Nhập năm: ");
        int n;
        n = day.nextInt();
        switch (t) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("Tháng " + t +" có 31 ngày"  );
                break;
            case 2:
                if (n%400 == 0 || (n%100 != 0 && n%4 == 0 )) {
                    System.out.printf("Tháng " + t +" có 29 ngày"  );
                    break;
                }else {
                    System.out.printf("Tháng " + t +" có 28 ngày"  );
                    break;
                }
            case 4:
            case 6:
            case 9:
            case 11:

                System.out.printf("Tháng " + t +" có 30 ngày"  );
                break;


        }
    }
}
