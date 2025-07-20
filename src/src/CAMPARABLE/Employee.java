package src.CAMPARABLE;

public class Employee  implements Comparable<Employee> {

	int id;
	String name;
	int age;

	Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	 public String toString()
	 {
		 return "Employee{id=" + id + ", name='" + name + "', age=" + age + '}';
	 }

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		//return Integer.compare(this.age,o.age);
		return this.name.compareTo(o.name);
	}
	 

}
