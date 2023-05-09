import java.lang.*;
import java.util.*;

class Employee implements Comparable<Employee>{
	String name;
	int age;
	int salary;

	Employee(){}
	Employee(String name, int age, int salary){
		this.name= name;
		this.age=age;
		this.salary=salary;
	}


	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", age=" + age +
				", salary=" + salary +
				'}';
	}

	@Override
	public int compareTo(Employee employee) {
		if(age == employee.age) {
			return salary - employee.salary;
		}
		else
			return age - employee.age;
	}
}
class SortWithCustomComparison {
	public static void main( String [] args ){

		Employee [] emp = new Employee[3];
		emp[0] = new Employee("aaa", 10, 10000);
		emp[1] = new Employee("bbb", 20, 40000);
		emp[2] = new Employee("ccc", 30, 500);

		Arrays.sort(emp);
		System.out.println(Arrays.toString(emp));

	}
}