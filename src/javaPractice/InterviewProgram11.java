package javaPractice;

import java.util.List;

public class InterviewProgram11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// MCQ Question
		
		int x=10;
		int y=5;
		int z=x++ + --y*2;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		// output ->11,4,18 But me is 11,4,20
		
		
		Integer[] array= {1,2};
		List<Integer> list=List.of(array);
		array[0]=10;
		System.out.println(list);
		
		//{1,2}
		
		char a=1;
		char b=2;
		System.out.println(a+b);
		

	}

}
