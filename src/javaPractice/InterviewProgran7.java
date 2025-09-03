package javaPractice;

import java.util.Arrays;
import java.util.List;

public class InterviewProgran7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	double ans=	list.stream().mapToDouble(Integer::doubleValue).average().getAsDouble();
	
		System.out.println(ans);
		
		
	}

}
