package code;

import java.util.HashSet;

public class hashsetduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//String[] str = {"deep","raj","raj"};
		
		int[] arr = {1,2,3,3,3,1,4,5,5};
		
		//define a hashset to store the string array
		//get the output of add which will return boolean of true or false 
		//false if elements are duplicate
		
		HashSet<Integer> s = new HashSet<Integer>(); //defined a hashset s
		
		//enhanced for loop
		boolean output=true;int i=1;
		
		for(int word:arr)
		{
			
			output = s.add(word);
		 if(output==false)
				 {
			 System.out.println("duplicate varaible found "+i+" "+ word);
			 i++;
				 }
		 
		 
		}
		if(output==true)
			System.out.println("no duplicate elements");
	}

}
