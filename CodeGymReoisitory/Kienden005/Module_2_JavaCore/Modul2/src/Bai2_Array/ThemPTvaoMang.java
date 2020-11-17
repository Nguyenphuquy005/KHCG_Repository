package Bai2_Array;

import java.util.Scanner;

public class ThemPTvaoMang {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.printf("Số cần chèn: ");
        int value;
        int index;
        value = imput.nextInt();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        do {
            System.out.printf("Vị trí cần chèn: ");
            index = imput.nextInt();
        } while (index < 0 || index > arr.length - 1);
        for (int i = arr.length-1 ; i>index ;i--) {
            int ori ;
            ori = arr[i-1];
            arr[i] = ori;
        }

        arr[index] = value;

        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + " ");
        }
    }
}
