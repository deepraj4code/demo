package code;

public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,4,7,9,10,13,1000,7895}; //assuming the array is sorted
		
		int start = a[0];
		int end = a[a.length-1];
		int mid = 0;
		
		int num = 7895;
		boolean flag = false;
		

		while(start<=end)
		{
			mid = (start+end)/2;
			if(num==mid)
			{
				//System.out.println("element found");
			    flag = true;
				break;
			}
			else if(num<mid)
				end = mid -1;
			else if(num>mid)
				start = mid + 1;
			
		}
		
		if(flag == false)
			System.out.println("not found");
		else
			System.out.println("element found");
		
		
	}

}
