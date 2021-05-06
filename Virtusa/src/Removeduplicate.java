
public class Removeduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="India is great";
		String s2="In";
		
		int[] count=new int[256];
		
		
		
		for(int i=0;i<s2.length();i++)
		{
			count[(int)s2.charAt(i)]--;
			
		}
		
		  for(int i=0;i<s1.length();i++)
		  {
			  if(count[i]==0)
				  System.out.println();
		  }

	}

}
