package javaPractice;

import java.util.Scanner;

public class FiboncciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in); //Creating Scanner object to take user input
		System.out.println("Enter the number of terms in the Fibonacci Series:");
		int terms=input.nextInt();
		
		int firstTerm=0, secondTerm=1;
		
		for(int i=1 ;i<=terms;i++) {
			
			System.out.print(firstTerm +" ");
			int nextTerm=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;

		}
		input.close(); //close the Scanner object  to avoid memory
	}

}
