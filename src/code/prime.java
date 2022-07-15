package code;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 23;
		
		for(int i = 2 ; i <num-1;i++)
		{
			
			
			if(num%i==0)
			{
				System.out.println("not prime");
			    break;
			}
			else
				System.out.println("prime");
		}

	}

}
