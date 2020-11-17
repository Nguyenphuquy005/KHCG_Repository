package Bai2_Array;

public class Arr2D {
    public static void main(String[] args) {
        int[][] arr2d = {{1,2,3},{4,5,6}};
        int a ;
        a = arr2d[0][0];
        for (int i=0;i<3;i++){
                if (a < arr2d[i][2]){
                    a = arr2d[i][2];
                }
            }

        System.out.println(a);

    }
}
