import java.util.*;
import java.util.Map.Entry;

public class WordsFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="big black bug bit a big black dog on his big black nose";
       String[] words=s.split(" ");
       
       Map<String, Integer> m=new HashMap<>();
       
       for(int i=0;i<words.length;i++)
       {
    	   if(m.containsKey(words[i]))
    		   m.put(words[i], m.get(words[i])+1);
       
       else
    	   m.put(words[i],1);
    	   }
       

       
       List<Entry<String,Integer>> list=new ArrayList<>(m.entrySet());
       Collections.sort(list, 
    		   (Entry<String,Integer> e1, Entry<String,Integer>  e2)->{
    			   return e2.getValue().compareTo(e1.getValue());
    		   }
    		   
    		   );
       
         HashMap<String,Integer> hm=new LinkedHashMap<>();
         for(Entry<String,Integer> entry : list)
         {
        	// System.out.println(entry.getKey()+" "+entry.getValue());
        	 hm.put(entry.getKey(), entry.getValue());
         }
       
         for(Map.Entry<String,Integer> entry : hm.entrySet())
         {
      	   System.out.println(entry.getKey()+" "+entry.getValue());
         }
       
	}
	

}
