package code;

public class factorial {
	
	static int n=1;
	
	public static int fact(int num)
	{
		
		if (num>1)
		return num*fact(num-1);
		else
	    return 1;		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5, result, alter=1;
		
		result = fact(num);
		
		System.out.println(result);
		
		for (int i =1;i<=num;i++)
		{
		alter = alter *i;	
		}
		System.out.println(alter);
		

	}
	
	
}
