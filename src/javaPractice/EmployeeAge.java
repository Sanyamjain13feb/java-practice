package javaPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	
		private String name;
		private int age;
		private double Salary;
		

		public Employee(String name, int age, double salary) {
			super();
			this.name = name;
			this.age = age;
			Salary = salary;
		}
		//Setter and Getter
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public double getSalary() {
			return Salary;
		}
		public void setSalary(double salary) {
			Salary = salary;
		}
		
		@Override
		public String toString() {
			return "Employee [name=" + name + ", age=" + age + ", Salary=" + Salary + "]";
		}
				
		
}

public class EmployeeAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees=Arrays.asList(
				new Employee("Ramesh",32,10000),
				new Employee("Sanyam",25,3000),
				new Employee("Sanjay",29,5000)
				);
	List<Employee> incrementSalary=	employees.stream().map( e -> {
			if(e.getAge()>25) {
			e.setSalary(e.getSalary()*1.10);
		} return e;
		}).collect(Collectors.toList());

	System.out.println(incrementSalary);
	}

}
