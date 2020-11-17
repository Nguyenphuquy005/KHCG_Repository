package Bai2_Array;

import java.util.Scanner;

public class TimGTNN_Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int arr[];

        do {
            System.out.printf("Emter size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter arr " + i + ":  ");
            arr[i] = scanner.nextInt();
        }
        int result;
        result = min(arr);
        System.out.println(result);
    }

    public static int min(int[] arr){
        int min = arr[0];
        int index =0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                index = i;
            }
        }
        return  min  ;
    }
}
