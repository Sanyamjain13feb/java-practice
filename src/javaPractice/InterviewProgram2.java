package javaPractice;

import java.util.Arrays;
import java.util.List;

public class InterviewProgram2 {
	public static void main(String [] args) {
	List<Integer> numbers=Arrays.asList(0,1,1,0,1,0,1,1,1,0,0);
	
	Integer sum=numbers.stream().reduce(0,Integer::sum);
	
	System.out.println("Number of 1s are "+sum);
	System.out.println("Number of 0s are " + (numbers.size()-sum));
	
	}

}
