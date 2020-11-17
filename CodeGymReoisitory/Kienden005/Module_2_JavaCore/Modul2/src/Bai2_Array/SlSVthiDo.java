package Bai2_Array;

import java.util.Scanner;

public class SlSVthiDo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size ;
        do {
            System.out.printf("Nhập số lượng sinh viên: ");
            size = input.nextInt();
        }while (size > 30);
        int[] arr = new int[size];
        for (int i=0 ; i<size ;i++){
            System.out.println("SV thứ " +(i+1) +":" );
            arr[i] = input.nextInt();
        }
        int count =0 ;
        for (int i=0 ;i<size ;i++){
            if (arr[i] >= 5 && arr[i] <=10){
                count ++;
            }
        }
        System.out.println("có " + count+" SV đậu");
    }
}
