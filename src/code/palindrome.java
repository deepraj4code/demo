package code;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 453;
		int actual = num;
		int rev = 0;
		while(num != 0)
		{
			rev = rev * 10 + num%10;
			num = num / 10;
		}
		
		System.out.println(rev);
if (actual == rev)
	System.out.println("yasssss");
else
	System.out.println("nooooo");
	}

}
