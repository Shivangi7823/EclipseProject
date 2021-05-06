
public class ReverseString {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="GeeksFor Geeks";
		
		 reverStr(str);
 
	}
	
	static void reverStr(String str) {
		
		if(str==null||str.length()<=0)

			return;
			else
			{
				System.out.print(str.substring(str.length()-1));
				reverStr(str.substring(0,str.length()-1));
			}
		
	}

}
