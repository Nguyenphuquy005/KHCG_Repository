import java.util.Scanner;
public class TimGTLN{
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.print("Size should not exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        for (int i=0;i<array.length;i++){
            System.out.print("emter arr " +  (i+1)+": " );
            array[i] = scanner.nextInt();
        }
        for (int i = 0;i<array.length;i++){
            System.out.println(array[i] + " ");
        }
        int max ;
        int index = 5;
        max = array[0];
        for (int i=0 ; i <array.length;i++){
            if (max < array[i]){
                max = array[i];
                index = i+1 ;
            }
        }
        System.out.println(max + " VT: " + index);
    }
}
