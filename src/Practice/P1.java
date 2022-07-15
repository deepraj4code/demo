package Practice;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		int a[]= {2,2,3,4,3,1,2};
		
		int count = 0 ;
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[i]==a[j+1])
				{
				count++;	
				}
			}
		}
		
		System.out.println(count);

	}

}
