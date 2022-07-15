package code;

public class arrayequal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {4,5,0,6,7};
		int b[]={4,5,1,6,7};
		int j = 0;
		
		if (a.length!=b.length)
		System.out.println("not equal");
		else
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==b[i])
					j++;
				else
				{
					System.out.println("not equal");
					break;
				}
				if(j==a.length)
					System.out.println("equal");
			}
		}
	}

}
