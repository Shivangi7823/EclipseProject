import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class P {
	public void getMove() throws IOException
	{
		FileInputStream fis = null;
		
			try{
			    fis = new FileInputStream("B:/myfile.txt"); 
			
		}catch(FileNotFoundException fnfe){
	           
		 }
		catch(IOException e)
		{
			
		}
		catch(Exception e)
		{
			
		}
	}
	
}

public class ConstructotChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P p=new P();
		p.getMove();

	}
	


}
