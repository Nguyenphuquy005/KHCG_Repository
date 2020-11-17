package Bai2_Array;

public class SoLanXHtrongChuoi {
    public static void main(String[] args) {
        String result ="" ;
        String str = "kienden";
        for (int i=0;i<str.length();i++){

            int count = 0;
            for (int j=0 ; j<str.length();j++){
                if (str.charAt(i) == str.charAt(j)){
                    count++ ;

                }
            }
          //  result += " " + str.charAt(i) + " sls " + count + ' ' ;
            System.out.println(" " + str.charAt(i) + " sls " + count + ' ');
        }
     //   System.out.println(result);
    }
}
