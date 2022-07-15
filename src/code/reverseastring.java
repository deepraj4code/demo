package code;

import java.util.ArrayList;

public class reverseastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S = "deepraj is a cow";
		int i = 0;
		//using chatat function
		for( i=S.length()-1;i>=0;i--)
		{
			System.out.print(S.charAt(i));
			
		}
		
        //using char array
		
		//how to conver a string into array
		
		char a[]= S.toCharArray();
		
		
	}

}
