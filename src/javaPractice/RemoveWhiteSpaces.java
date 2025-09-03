package javaPractice;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputString="java is fun to learn";
		
		String stringWithoutWhiteSpaces=inputString.replaceAll("\\s+", "");

		System.out.println("original String ->" +inputString);
		System.out.println("String Without Whitespaces ->" +stringWithoutWhiteSpaces);
	}

}
