package javaPractice;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculateAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your Birthdate(yyyy-mm-dd)");
		String birthDateString=scanner.nextLine();
		
		scanner.close();
		
		
		LocalDate birthDate=LocalDate.parse(birthDateString);
		
		
		LocalDate currentDate=LocalDate.now();
		
		Period age=Period.between(birthDate, currentDate);
		
		System.out.println(age.getYears());
		
	}

}
