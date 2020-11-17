import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArraylist {
    public static class Student {
        private int id;
        private String name;

        public Student() {

        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String Show() {
            return "ID: " + this.getId() + '\n' + "Name: " + this.getName();
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        Student a = new Student(1, "Lê ngọc huy");
        Student b = new Student(2, "Lê ngọc huy");
        Student c = new Student(3, "Lê ngọc huy");
        Student d = new Student(4, "Lê ngọc huy");
        Student k = new Student(4, "Lê ngọc quy");
        MyArarryList<Student> studentMyArarryList = new MyArarryList<>();
        studentMyArarryList.add(a) ;
        studentMyArarryList.add(b) ;
        studentMyArarryList.add(c) ;
        studentMyArarryList.add(d);
        studentMyArarryList.add(k);

        for (int i = 0 ;i <studentMyArarryList.size();i++){
            Student sv1 = (Student) studentMyArarryList.elements[i];
            System.out.println(sv1.Show());
        }

        MyArarryList<Student> ararryList = studentMyArarryList.Clone();
        for (int i = 0 ;i <ararryList.size();i++){
            Student sv1 = (Student) ararryList.get(i);
            System.out.println(sv1.Show());
        }

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(12358995);


    }
}
