package code;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i =0;
		int  first = 1, second = 1, fib =0;
		
		for (i=0;i<=20;i++)
		{
			fib = first + second ;
			first = second;
			second = fib;
			
			System.out.print(fib);
			System.out.print(" ");
		}

	}

}
