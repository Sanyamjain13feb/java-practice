package javaPractice;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class InterviewProgram4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<Integer> number=Arrays.asList(4,5,20,7,10,9);
		number.stream().mapToInt(n->n*n).forEach(System.out::println);
		
		
		OptionalDouble	opt=number.stream().mapToInt(n->n*n).filter(n->n >=100).average();
		System.out.println(opt.getAsDouble());
	}

}
