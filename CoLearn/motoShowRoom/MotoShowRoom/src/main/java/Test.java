public class Test {
    public static void main(String[] args) {
        int[] statues = {1, 2, 3, 4, 99, 5, 6};
        System.out.println(addTwoDigits(3));

    }

  public  static   int addTwoDigits(int n) {

      return (int) Math.pow(10,n)-1;
  }
}
