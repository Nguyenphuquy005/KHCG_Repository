package Bai1;

import java.util.Scanner;

public class HT100SNT {
    public static void main(String[] args) {


        for (int i = 0; i <= 100; i++) {
            boolean kt = true;
            if (i < 2){
                kt = false ;
            }
            if (i>2){
                for (var j=2 ; j < i ;j++){
                    if (i%j == 0){
                        kt = false;
                    }
                }
            }
               if (kt == true){
                   System.out.println(i);
               }
        }
    }
}
