package practise1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> ar = new ArrayList <Integer>();
          ar.add(1);
          ar.add(2);
          ar.add(3);
          ar.remove(0);
          
          Iterator it = ar.iterator();
          while(it.hasNext()) {
        	  System.out.println(it.next());
          }
          System.out.println();
          LinkedList <Integer> l1 = new LinkedList <Integer>();
          l1.add(1);
          l1.add(2);
          l1.add(3);
          
          Iterator ab = l1.iterator();
          while(ab.hasNext()) {
        	  System.out.println(ab.next());
          }
          
          
	}

}
