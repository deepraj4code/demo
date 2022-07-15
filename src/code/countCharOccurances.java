package code;

public class countCharOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S = "Deepraj chatterjee";
		
		int count = 0 ;
		
		
		
		for(int i=0;i<S.length();i++)
		{
		if(S.charAt(i)=='e')
		{
			count++;
		}
		}
		
		System.out.println(count);
		
		//other way to do it from calculating the length
		
		int before = S.length();
		
		S = S.replaceAll("e","");
		
		int after = S.length();
		
		int result = before - after;
		System.out.println("no of occusrance of e is "+result);

	}

}
