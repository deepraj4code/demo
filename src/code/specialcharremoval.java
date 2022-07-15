package code;

public class specialcharremoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "deepraj!#%%%%@#$$^chatterjee";
		
		name = name.replaceAll("[^a-zA-z0-9]", "");
		
		System.out.println(name);

	}

}
