package com.cg;

public class EqualSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int ar[] = {2, 3, 4, 1, 4, 5};
		  int ans=0;
		  int i=0,j=0;
		  
		  int lsum=0,rsum=0;
		  for(i=0,j=ar.length-1;i<j;i++,j--)
		  {
			  lsum+=ar[i];
			  rsum+=ar[j];
			  
			  while(lsum<rsum && i<j)
			  {
				  lsum+=ar[i];
				  i++;
			  }
			  
			  while(rsum<lsum && i<j)
			  {
				  rsum+=ar[j];
				  j--;
			  }
			  
			  if(rsum==lsum & i==j)
			  {
				  ans=ar[i];
				 
				  break;
			  }
		  }
		  System.out.println(ar[i]);

	}

}
