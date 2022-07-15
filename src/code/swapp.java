package code;

public class swapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 7;
		int b= 20;
		
		//logic1
		int temp =0;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a+"and"+b);
		
		//logic2 using addition and substraction without using 3rd variable
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		// by using multiplication and division only when a and b are not zeros
		
		a = a * b ;
		b = a / b ;
		a = a / b ; 
		
		
		
		
		

	}

}
