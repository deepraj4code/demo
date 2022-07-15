package code;

public class duplicatevaluesinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,3,5,6,6,7,8,9,10,6,3,5,11};
		
		int dup = a[0];
		
		for(int i =0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			if(a[j]==a[i])
				System.out.println("duplicate element is "+a[j]);
				
		}

	}
		
		//how to reduce the time and use collection using hashset
	}
}
