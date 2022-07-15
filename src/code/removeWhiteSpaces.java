package code;

public class removeWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S = "my name is deepraj chatterjee";
		
		System.out.println(S.trim());
		
		System.out.println(S.replaceAll(" ", "")); // or System.out.println(S.replaceAll("//s", ""));

	}

}
