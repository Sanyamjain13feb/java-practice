package javaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employeess{
	private String name;
	private int age;
	private String gender;
	private String department;
	
	public Employeess() {
		
	}
	
	public Employeess(String name, int age, String gender, String department) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employeess [name=" + name + ", age=" + age + ", gender=" + gender + ", department=" + department + "]";
	}
	
}

public class EmployeesgetDepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employeess> employeess=new ArrayList<>();
		Employeess e1=new Employeess("ABC",30,"Female","HR");
		Employeess e2=new Employeess("PQR",25,"Male","IT");
		Employeess e3=new Employeess("LMN",30,"Male","HR");
		Employeess e4=new Employeess("XYZ",28,"Female","IT");
		
		employeess.add(e1);
		employeess.add(e2);
		employeess.add(e3);
		employeess.add(e4);
		
		// employeess.stream().map(Employeess::getDepartment).distinct().forEach(System.out::println);
		
//	Map<String,Long> result= employeess.stream()
//		.collect(Collectors.groupingBy(Employeess::getDepartment,Collectors.counting()));
		
//	System.out.println(result);
		
		employeess.stream().map(Employeess::getGender).distinct().forEach(System.out::println);
	}

}
