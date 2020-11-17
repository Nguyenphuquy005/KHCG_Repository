public class demo {
    public static void main(String[] args) {
        int[] a = {50, 100};

        System.out.println(a[0]);
        m(a);
    }

    static void m(int[] x) {
        x[0] = 200;
    }
}
