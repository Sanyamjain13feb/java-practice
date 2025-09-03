package javaPractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Employees {
	
	private String name;
	private String email;
	private double Salary;
	
	
	public Employees(){
		
	}
	
	public Employees(String name, String email, double salary) {
		super();
		this.name = name;
		this.email = email;
		Salary = salary;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employees [name=" + name + ", email=" + email + ", Salary=" + Salary + "]";
	}
	
}



public class EmployeeSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Employees> employees=new ArrayList<>();
       	
		 Employees e1=new  Employees("Sanjeev","san@gmail.com",10000);
		 Employees e2=new Employees ("Ramesh","ramesh@gmail.com",20000);
		 Employees e3=new  Employees("Raghu","rag@gmail.com",30000);
		 Employees e4=new Employees ("Deepak","dee@gmail.com",40000);
		 Employees e5=new  Employees("Ram","ram@gmail.com",50000);
		Employees e6=new  Employees("Sandeep","sandeep@gmail.com",20000);
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		
	Optional<Employees> empwithHighestSalary =	employees.stream()
	.sorted(Comparator.comparingDouble(Employees::getSalary)
	.reversed()).findFirst();
		
	System.out.println(empwithHighestSalary);
	
	Optional<Employees> empWithSecondHighestSalary=employees.stream()
			.sorted(Comparator.comparingDouble(Employees::getSalary).reversed())
			.skip(1).findFirst();
	
	System.out.println(empWithSecondHighestSalary);
	}

}
