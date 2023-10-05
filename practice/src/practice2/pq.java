package practice2;

import java.util.*;

public class pq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  PriorityQueue <String> pq=new PriorityQueue<String>();
  
  ArrayDeque <String> p=new ArrayDeque<String>();
  
  p.add("A");
  p.add("AA");
  p.add("AAA");
  p.add("AAAA");
  
 // pq.add(null);
  p.remove();
  
  Iterator i=p.iterator();
  
  while(i.hasNext()) {
	  System.out.println(i.next());
  }
	}

}
