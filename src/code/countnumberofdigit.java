package code;

public class countnumberofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		long num = 56868, num1;
		int count = 1;
		for(int i=0;i<num;i++)
		{
			num = num /10;
			
			count++ ;
		}
		
		System.out.println(count);
		
		//even and odd digits in a number
		
		int number= 145678;
		
		int odd=0, even=0;
		
		for (int j=0;number>0;j++)
		{
			num1 = number % 10 ;
			
			if (num1 % 2 == 0)
			    even++;
			else 
				odd++;
			
			number = number/10;
			
		}
		
		System.out.println("odd number is " + " "+odd + "even number is "+ even);
	}

}
