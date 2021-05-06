import java.util.*;

public class Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList();
		Abc t=new Abc();
		Abc t1=new Abc();
		l.add(t);
		l.add(t1);
		Collections.sort(l);
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
	}

}
