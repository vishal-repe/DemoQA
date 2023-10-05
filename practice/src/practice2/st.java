package practice2;

import java.util.*;

public class st {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //  HashSet <String> ht=new HashSet<String>();
	//	LinkedHashSet <String> ht=new LinkedHashSet<String>();
		
		TreeSet <String> ht= new TreeSet<String>();
    ht.add("Ajay");
    ht.add("vishal");
    ht.add("Manish");
    ht.add("Ravi");
    ht.add("Manoj");
   
    
    
    
    
  //  Iterator it=ht.iterator();
  //  while(it.hasNext()) {
   // 	System.out.println(it.next());
 //   }
    for(String s:ht) {
    	System.out.println(s);
    	
    }
    
	}

}
