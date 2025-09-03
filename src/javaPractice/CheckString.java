package javaPractice;

public class CheckString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1=null;
		String str2="";
		String str3="java";
		
		
		//Checking if str1 is null or empty
		if(str1 == null || str1.isEmpty()) {
			System.out.println("str1 is null or empty");
		}else {
			System.out.println("str1 is not null or empty");
		}
		
		//Checking is str2 is null or empty
		if(str2 ==null || str2.isEmpty()) {
			System.out.println("str2 is null or empty");
	
		}else {
			System.out.println("str2 is not null or empty");
			
		}
		//Checking is str3 is null or empty
		if(str3 ==null || str3.isEmpty()) {
			System.out.println("str3 is null or empty");
			
		}
		else {
			System.out.println("str3 is  not null or empty");
		}
	}

}
