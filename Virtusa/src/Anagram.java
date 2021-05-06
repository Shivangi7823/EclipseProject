
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="listen";
		String s2="silents";
		
		int[] count=new int[256];
		int flag=1;
		
		if(s1.length() !=s2.length())
		{
			flag=0;
			System.out.println("not anagram");
			
		}
		else
		{
			for(int i=0;i<s1.length();i++)
			{
				count[(int)s1.charAt(i)]++;
				count[(int)s2.charAt(i)]--;
				
			}
		}

		
		for(int i=0;i<256;i++)
		{
			if(count[i]!=0)
			{
				System.out.println("not anagram");
				flag=0;
				break;
			}
		}
		if(flag==1)
			System.out.println("anagram");
		
	} 

}
