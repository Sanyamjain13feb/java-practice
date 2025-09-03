package javaPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterviewProgram12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int[] a= {1,2,3,4};
		for(float b:a) {
			System.out.print(b);
			System.out.print(" ");
	*/		
		
		List<Integer> numbers=List.of(1,0,1,0,0,0,1);
	List<Integer> move=	Stream.concat(numbers.stream().filter(n->n==0)
			,numbers.stream().filter(n->n!=0))
			.collect(Collectors.toList());
		System.out.println(move);	
		
		//Max  element of the list
		
		List<Integer> numbers1=Arrays.asList(3,2,2,3,7,9,5);
			
		Integer list2=numbers1.stream().max((i,j)->i.compareTo(j)).get();
		
			System.out.println(list2);
			
		}
		
	}


