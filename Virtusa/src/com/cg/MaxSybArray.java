package com.cg;

public class MaxSybArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar= {2,-4,6,3,2,-6,7,-8,6};
		int sum=0;
		int starting=0,end=0,s=0;
		 
		
		int res=Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++)
		{
			sum+=ar[i];
			if(sum>res)
			{
				res=sum;
				end=i;
				//starting=s;
			}
			
			if(sum<0)
			{
			 	sum=0;
			     starting=i+1;	
			}
			
			
		}
		System.out.println(res);
		System.out.println(starting+" "+end);

	}

}
