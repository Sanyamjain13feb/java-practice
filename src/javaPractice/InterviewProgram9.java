package javaPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Patient {
	private String name;
	private int age;
	private String disease;
	private int amount;
	
	 public Patient() {
		
	}

	public Patient(String name, int age, String disease, int amount) {
		super();
		this.name = name;
		this.age = age;
		this.disease = disease;
		this.amount = amount;
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

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", age=" + age + ", disease=" + disease + ", amount=" + amount + "]";
	}
	 
	
}

public class InterviewProgram9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Patient p1=new Patient("P1" ,20,"Corona",18000);
		Patient p2=new Patient("P2" ,26,"Fever",6000);
		Patient p3=new Patient("P3" ,29,"Corona",8000);
		Patient p4=new Patient("P4" ,23,"Corona",12000);
		
		List<Patient> patient=Arrays.asList(p1,p2,p3,p4);
		
		//patient.stream().filter(p->p.getDisease().equals("Corona") && p.getAge()< 25).forEach(System.out::println);
		Double AverageBillPaid=patient.stream().filter(p->p.getDisease().equals("Corona"))
				.collect(Collectors.averagingDouble(Patient::getAmount));
		
		System.out.println("Average Bill Paid " +AverageBillPaid);
	}

}
