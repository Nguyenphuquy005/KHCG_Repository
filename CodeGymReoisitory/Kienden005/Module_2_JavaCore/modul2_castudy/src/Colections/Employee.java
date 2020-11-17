package Colections;

import java.util.*;

public class Employee {
    private String Id ;
    private String name ;

    public Employee(String id, String name) {
        Id = id;
        this.name = name;
    }

    public Employee() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id='" + Id + '\t' +
                ", name='" + name + '\t' +
                '}';
    }

    public static void main(String[] args) {
        Employee em1 = new Employee("01","Lê Ngọc Huy Số 1");
        Employee em2 = new Employee("02","Lê Ngoc Huy");
        Employee em3 = new Employee("03","Lê Ngọc Huy Bình Thường");
        Employee em4 = new Employee("04","Lê Ngọc Huy  ");
        Employee em5 = new Employee("05","Le NGọc Huy ");
        Map map = new HashMap() ;
        map.put(001 , em1.toString());
        map.put(002 , em2.toString());
        map.put(003 , em3.toString());
        map.put(004 , em4.toString());
        map.put(005 , em5.toString());
        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            System.out.println(map.get(key));
        }
      Queue<Employee> employees = new LinkedList<>();
        employees.add(em1) ;
        employees.add(em2);
        employees.add(em3);
        employees.add(em4);
        employees.add(em5);

            System.out.println(employees);

         Stack<Employee> st = new Stack<>();
         st.push(em1) ;
         st.push(em2) ;
        st.push(em3) ;
        st.push(em4) ;
        st.push(em5) ;
        System.out.println(st);
    }
}
