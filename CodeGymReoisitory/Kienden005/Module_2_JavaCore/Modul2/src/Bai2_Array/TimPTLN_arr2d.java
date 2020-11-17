package Bai2_Array;

import java.util.Scanner;

public class TimPTLN_arr2d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhập Row: ");
        int row ;
        row = input.nextInt();
        System.out.printf("Nhập Column: ");
        int column ;
        column = input.nextInt();
        int[][] arr2d = new int[row][column];
        arr2d[1][1] = 1 ;
        System.out.println(arr2d[1][1]);
        for (int i=0 ;i< arr2d.length;i++){
            for (int j =0 ; j< arr2d[i].length;j++){
                System.out.printf("Enter " + i + " " + j +": ");
                arr2d[i][j] = input.nextInt();
            }
        }
        for (int i=0 ;i< arr2d.length;i++){
            for (int j =0 ; j< column ;j++){
                System.out.printf(arr2d[i][j] + " ");
            }
            System.out.println("");
        }
        int a ;
        a = arr2d[0][0];
        for (int i=0 ;i< arr2d.length;i++){
            for (int j =0 ; j< arr2d[i].length ;j++){
               if (a < arr2d[i][j]){
                   a = arr2d[i][j];
               }
            }
        }
        System.out.println("max: "+ a);
    }
}
