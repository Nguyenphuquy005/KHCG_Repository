package Bai1;

import java.util.Scanner;

public class ChiSoBMI {
    public static void main(String[] args) {
        Scanner dl = new Scanner(System.in);
        float weight;
        System.out.printf("Nhập cân nặng: ");
        weight = dl.nextFloat();
        float height;
        System.out.printf("Nhập chiều cao: ");
        height = dl.nextFloat();
        float bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.printf("Underweight ");
        } else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.printf("Normal");
        } else if (bmi >= 25.0 && bmi < 30) {
            System.out.printf("Overweight");
        }else if (bmi >= 30) {
            System.out.printf("Obese");
        }
    }
}
