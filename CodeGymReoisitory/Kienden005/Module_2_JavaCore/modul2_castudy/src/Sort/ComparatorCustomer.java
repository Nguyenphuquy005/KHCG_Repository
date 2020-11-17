package Sort;

import Models.Customer;

import java.util.Comparator;

public class ComparatorCustomer implements Comparator<Customer> {
    @Override
    public int compare(Customer cur1, Customer cur2) {
        if (cur1.getFullName().compareTo(cur2.getFullName()) == 0) {
            return cur1.getYearBirthday() - cur2.getYearBirthday();
        }
        return cur1.getFullName().compareTo(cur2.getFullName());
    }
}
