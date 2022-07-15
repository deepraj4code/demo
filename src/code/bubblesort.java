package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a = {9,6,7,1,2,43,3};int t =0;
		
		List<Integer> result = streamlist(a);
		System.out.println(result); // sorted list of numbers
		System.out.println(result.get(result.size()-2)); //second max number
		
		
	//bubble sort commented time complexity o(n2) , space complexity o(1)	
	/*for(int i=0;i<a.length-1;i++)
	{
		for(int j=0;j<a.length-1;j++)
		{
		
		if(a[j]>a[j+1])
		{
			t = a[j+1];
			a[j+1]=a[j];
			a[j]=t;
			//break;
		}
		}
	}
     for(int b:a)
     {
    System.out.print(b+" ");	 
     }*/
		//using steams
		
		
	}
	
	
	public static List<Integer> streamlist(int[] a)
	{
		ArrayList<Integer> arr = new ArrayList<Integer>(); // defining a integer array list
		
		for(int b:a) // adding the array values into the array list
		{
			arr.add(b);
		}
		
		//streams can be used with array list 
		
		arr.stream().sorted().forEach(d->System.out.print(d+" ")); //printing sorted array
	
		
	List<Integer> sor = arr.stream().sorted().collect(Collectors.toList());
		return sor;
	}
		
	
}
