package src.CAMPARATOR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ComparatorExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "John", 25));
        employees.add(new Employee(2, "Alice", 30));
        employees.add(new Employee(3, "Bob", 22));
        employees.add(new Employee(4, "David", 25));

        System.out.println("Original List:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Sort by Age
        Collections.sort(employees, new AgeComparator());
        System.out.println("\nSorted by Age:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Sort by Name
        Collections.sort(employees, new NameComparator());
        System.out.println("\nSorted by Name:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}