package javaPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee12{
	private int id;
	private String name;
	private int age;
	
	
	//Constructor
	public Employee12(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	//Setter and Getter
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}	
	
}

public class GroupEmployeeById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee12> employees=Arrays.asList(
				new Employee12(1,"Ramesh",30),
				new Employee12(2,"Umesh",28),
				new Employee12(3,"Sanjay",32),
				new Employee12(4,"Raj",35),
				new Employee12(5,"Ram",30),
				new Employee12(6,"John",28)
				);

	
	Map<Integer,List<Employee12>> map =employees.stream()
	.collect(Collectors.groupingBy(employee->employee.getAge()));
	
	map.forEach((key,value)->{
		System.out.println("Age:"+key);
		System.out.println("List of employee:" +value);	
	});
}
}
