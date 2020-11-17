package Bai2_Array;

import java.util.Scanner;

public class XoaPTkhoiManf {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6};
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhập Pt cần xóa: ");
        int a;
        a = input.nextInt();
        int index = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                index =i;
                System.out.println(arr[i] + " tại: " + index);
            }
        }
       //arr[index] = arr[index+1];
        for (int j = index; j < arr.length-1; j++) {
            arr[j] = arr[j + 1];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + " ");
        }
    }
}
