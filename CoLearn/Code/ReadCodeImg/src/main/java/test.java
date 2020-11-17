import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        String s1 = "java string split method by viettuts";
        String[] words = s1.split("\\s");//tach chuoi dua tren khoang trang
        String result ="" ;
        for (String w : words) {
//            w = w.substring(0,1).toUpperCase() + w.substring(1) ;
            result = result + w + " " ;

            System.out.println(result);
        }
    }
}
