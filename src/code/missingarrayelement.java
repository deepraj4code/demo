package code;

public class missingarrayelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//array shouldnt have duplicates
		// no need of sorted array
		//array should be in a range
		
		
		int a[]= {1,2,3,5,6,7,8,9,10,11};
		int sum=0, sum1=0,i;
		
		for(i=0;i<a.length;i++)
		{
		//sum of the array elements
			sum = sum + a[i];
		
		}
		
		int min=a[0]; //pointers to store min and max values
		int max=a[0];
		
		for (i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			else if(a[i]>max)
			{
			    max = a[i];
			}
		}
		System.out.println("minimum number in the array "+min);
		System.out.println("maximum number in the array "+max);
		for(int j=min;j<=max;j++)
		{
			sum1 = j + sum1; 
		}
		//System.out.println(sum);
		//System.out.println(sum1);
		
		int missingele= sum1-sum;
		
		System.out.println("missing element is "+missingele);

	}

}
