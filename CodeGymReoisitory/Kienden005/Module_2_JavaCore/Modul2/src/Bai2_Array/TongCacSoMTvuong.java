package Bai2_Array;

public class TongCacSoMTvuong {
    public static void main(String[] args) {
        int[][] arr2d = {{1, 2, 3, 4,5, 5}, {4, 5, 6, 5, 6}, {1, 2, 3, 6, 5, 4}};
        int sum;
        sum = 0;
        int j = 0;
        for (int i = 0; i < arr2d.length; i++) {
            sum += arr2d[i][j];
            j++;
        }
        System.out.println(sum);
        // tổng các số trong cột
        for (int i = 0; i < arr2d.length; i++) {
            int sun1 = 0;
            for (int v = 0; v < arr2d[i].length; v++) {
                sun1 += arr2d[i][v];
            }
            System.out.println(sun1);
        }
    }
}
