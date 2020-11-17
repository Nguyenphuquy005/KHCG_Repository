import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a ;
        ArrayList<String> arrCricle = new ArrayList<>();

      do {
          Scanner input = new Scanner(System.in);
          System.out.println("1.thêm hình");
          System.out.println("2.xem hình");
          System.out.println("0.thoát hình");
          System.out.printf("Enter: ");
          a = input.nextInt();
          switch (a){
              case 1 :
                  System.out.printf("1.Hinh tròn " + '\n' + "2.Hình vuông");
                  int b ;
                  b = input.nextInt();
                  switch (b){
                      case 1 :
                          System.out.println(" nhập bk ht: ");
                          double r ;

                          r = input.nextInt();
                          Square cr = new Cricle();
                          ((Cricle)cr).setR(r);
                          ((Cricle)cr).setShape("Blue");
                          arrCricle.add(cr.howtocolor());
                          continue;
                                 }

              case 2 :
                  System.out.println(arrCricle);
                  break;


          }
      }while (a != 0);
    }
}
