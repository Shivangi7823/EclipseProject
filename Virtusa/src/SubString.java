
public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdef";
		
		int n=s.length();
		
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				//int len=i+j;
				for(int k=i;k<=j;k++)
					System.out.print(s.charAt(k));
				System.out.println();
			}
		}

	}

}
