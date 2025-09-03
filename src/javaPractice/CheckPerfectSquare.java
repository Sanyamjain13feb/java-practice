package javaPractice;

import java.util.Scanner;

public class CheckPerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the  integer number ");
		
		int number =sc.nextInt();
		
		int sqrt=(int)Math.sqrt(number);
		
		if(sqrt*sqrt ==number) {
			System.out.println(number +"is a perfect number");
		}
			else {
			System.out.println(number +"is a not perfect number");
		}
		sc.close();
	}

}
