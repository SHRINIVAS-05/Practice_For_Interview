package src.CAMPARATOR;

import java.util.*;

//Define the Employee class
class Employee {
	int id;
	String name;
	int age;

	Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// For printing the Employee details
	@Override
	public String toString() {
		return "Employee{id=" + id + ", name='" + name + "', age=" + age + '}';
	}
}

//Comparator to sort by age
class AgeComparator implements Comparator<Employee> {
	public int compare(Employee e1, Employee e2) {
		return Integer.compare(e1.age, e2.age);
	}
}

//Comparator to sort by name
class NameComparator implements Comparator<Employee> {
	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name);
	}
}
