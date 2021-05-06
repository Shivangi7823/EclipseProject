import java.util.*;



public class TreeSetDemo {
    public static void main(String[] args)
    {
    	Employee e1=new Employee("ABC", 1);
    	Employee e2=new Employee("ABC", 1);
    	Employee e3=e1;
    	
    	Map<Employee,Integer> m =new HashMap<>();
    	m.put(e1, 10);
         m.put(e2, 20);
         m.put(e3, 30);
         m.put(null, 50);
         m.put(null, 60);
    	System.out.println(m.size()+" "+m);
    	
    	
    	Abc abc=new Abc();
    	abc.m1(null);
    
    }
}
