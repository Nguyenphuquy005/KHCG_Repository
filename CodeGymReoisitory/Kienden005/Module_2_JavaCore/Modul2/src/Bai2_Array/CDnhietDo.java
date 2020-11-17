import java.util.Scanner;
public class CDnhietDo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice){
                case 1 :
                        fahrenheit = input.nextInt();
                    System.out.printf("C sang F " + C_F(fahrenheit));
                    break;
                case 2 :
                    celsius = input.nextInt();
                    System.out.printf("F sang C: "+ F_C(celsius));
                    break;

            }

        }while (choice != 0);
    }
    public static double C_F(double F){
           double C = (5.0 / 9) * (F - 32);
           return C ;
    }
    public  static double F_C(double C){
        double F = (9.0 / 5) * (C + 32) ;
        return F ;
    }
}
