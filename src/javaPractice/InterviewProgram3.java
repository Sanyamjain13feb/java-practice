package javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employeesss{
	private String name;
	private String Department;
	private int Salary;
	
	public Employeesss() {
		
	}
	
	public Employeesss(String name, String department, int salary) {
		super();
		this.name = name;
		Department = department;
		Salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employeesss [name=" + name + ", Department=" + Department + ", Salary=" + Salary + "]";
	}
	
	
	
}

public class InterviewProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*List<Employeesss> employees=new ArrayList<>(); 
		
		Employeesss e1=new Employeesss("Employees1","IT",10000);
		Employeesss e2=new Employeesss("Employees2","IT",20000);
		Employeesss e3=new Employeesss("Employees3","IT",30000);
		Employeesss e4=new Employeesss("Employees4","CS",10000);
		Employeesss e5=new Employeesss("Employees5","CS",20000);
		Employeesss e6=new Employeesss("Employees6","CS",30000);
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		
		*/
		
		List<Employeesss> employees=Arrays.asList(
				new Employeesss("Employees1","IT",10000),
				new Employeesss("Employees1","IT",20000),
				new Employeesss("Employees1","IT",30000),
				new Employeesss("Employees1","CS",10000),
				new Employeesss("Employees1","CS",20000),
				new Employeesss("Employees1","CS",30000)
				);
		
		Map<String,List<Employeesss>> byDepartment=employees.stream()
				.collect(Collectors.groupingBy(Employeesss::getDepartment));
		
		System.out.println(byDepartment);
		
		// find the Highest paid Employee from Department using Java8
		
	Map<String,Optional<Employeesss>> byMaxDepartment=	employees.stream()
		.collect(Collectors.groupingBy(Employeesss::getDepartment
				,Collectors.maxBy(Comparator.comparingDouble(Employeesss::getSalary))));
	
	System.out.println(byMaxDepartment);
	}

}
