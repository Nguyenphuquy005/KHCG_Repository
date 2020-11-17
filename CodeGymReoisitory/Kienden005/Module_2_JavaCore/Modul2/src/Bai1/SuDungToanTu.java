import java.util.Scanner;
public class SuDungToanTu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner dt = new Scanner(System.in);
        System.out.printf("Weidt:  ");
        width = dt.nextFloat();
        System.out.printf("Height:  ");
        height = dt.nextFloat();
        System.out.println("DT= "+ width*height);

    }
}
