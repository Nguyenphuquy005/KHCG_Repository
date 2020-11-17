import java.sql.SQLOutput;
import java.util.Scanner ;
public class TimGTtrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name:  ");
        String input_name = scanner.nextLine();
        boolean cheickName = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + (i + 1));
                cheickName = true;
                break;

            }
        }
        if (!cheickName) {
            System.out.println("Not fount");
        }
    }
}
