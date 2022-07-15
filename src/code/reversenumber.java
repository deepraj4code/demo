package code;

public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 43243265;
		
		int a ,c, b;
	
		int reve = 0;
	
		
		
		//using algorithm 
		
		while(num!= 0)
		{
		reve = reve * 10 + num % 10; // modulus always gives last digit
		num = num / 10;
		}
		System.out.println(reve);
		
		//other way to do it - convert the number into string and using string.reverse()
		
		
		
		
		
		
		

	}

}
