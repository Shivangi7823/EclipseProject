package com.cg;

import java.util.Arrays;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {Integer.MIN_VALUE, Integer.MIN_VALUE, 34, Integer.MIN_VALUE};
		  int n = arr.length;
		  print2largest(arr, n);

	}
	static void print2largest(int arr[],
            int arr_size)
{
	
		 
		    // There should be atleast two elements
		    if (arr_size < 2)
		    {
		        System.out.printf(" Invalid Input ");
		        return;
		    }
		 
		    int first = Integer.MIN_VALUE;
		    int second = Integer.MIN_VALUE;
		 int i=0;
		 int flag=1;
		    // Find the largest element
		    for(i = 0; i < arr_size; i++)
		    {
		          if(arr[i]>first)
		          {
		        	  second=first;
		        	  first=arr[i];
		          }
		          
		          else if(arr[i]>=second)
		          {   flag=0;
		        	  second=arr[i];
		          }
		    }
		 
		    // Find the second largest element
		   
		    if (second == Integer.MIN_VALUE && flag==1)
		        System.out.printf("There is no second " +
		                          "largest element\n");
		    else
		        System.out.printf("The second largest " +
		                          "element is %d\n", second);

}
}
