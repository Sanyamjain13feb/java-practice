package javaPractice;

public class FirstNonRepeatedCharacterASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="swiss";
		char result=findFirstNonRepeatedChar(str);
		System.out.println("First non-Repeated Character is " + result);

	}

	private static char findFirstNonRepeatedChar(String str) {
		// TODO Auto-generated method stub
		
		int [] charCount=new int[256];
		for(int i=0;i<str.length();i++) {
			charCount[str.charAt(i)]++;
		}
		
		for(int i=0;i<str.length();i++) {
			if(charCount[str.charAt(i)]==1) {
				return str.charAt(i);
			}
		}
		
		return '\0';
	}

}

