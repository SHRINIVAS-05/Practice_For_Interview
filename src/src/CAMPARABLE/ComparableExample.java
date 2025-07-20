package src.CAMPARABLE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

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

        // Sort using Comparable (by age)
        Collections.sort(employees);

        System.out.println("\nSorted by Age (Using Comparable):");
        for (Employee e : employees) {
            System.out.println(e);
        }

	}

}
