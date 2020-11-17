package Commons;

import java.lang.reflect.Array;
import java.util.Scanner;

public class FuncValidation {
    private static String regex = "";
    private static Scanner sc;

    public static boolean cheickNameService(String str) {
        regex = "^([\\p{Lu}]|([\\p{Lu}][\\p{Ll}]{1,}))([\\s]([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,6}$";
        return str.matches(regex);
    }

    // cheick Double
    public static double cheickValiNumberDouble(String content, String errMes) {
        while (true) {
            try {
                sc = new Scanner(System.in);
                System.out.println(content);
                return sc.nextDouble();
            } catch (Exception ex) {
                System.out.println(errMes);
            }
        }
    }

    public static Integer cheickValiNumberInterger(String content, String errMes) {
        while (true) {
            try {
                sc = new Scanner(System.in);
                System.out.println(content);
                return sc.nextInt();
            } catch (Exception ex) {
                System.out.println(errMes);
            }
        }
    }

    public static boolean cheickFreecome(String string) {
        regex = "^karaoke$|car$|food$|drink$|massage$";
        return string.matches(regex);

    }

    public static boolean cheickMail(String string) {
        regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return string.matches(regex);
    }

    public static boolean chieckBrithday(String brithday) {
        regex = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";
        return brithday.matches(regex);
    }

    public static boolean cheickSex(String sex) {
        regex = "^male$|^female$|^unknown$";
        return sex.matches(regex);
    }

    public static boolean cheickPhoneNumber(String phone) {
        regex = "^[0-9]{10}$";
        return phone.matches(regex);
    }

    public static boolean cheickIDcard(String phone) {
        regex = "^[0-9]{8}$";
        return phone.matches(regex);
    }
}