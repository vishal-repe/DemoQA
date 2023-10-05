package practice2;

import java.util.*;

public class mp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //HashMap<Integer,String> mp=new HashMap<Integer,String>();
//  LinkedHashMap <Integer,String> mp= new LinkedHashMap<Integer,String>();
		TreeMap<Integer,String> mp=new TreeMap<Integer,String>();

mp.put(10,"Ad");
mp.put(20,"AF");
mp.put(30,"AG");
mp.put(40,"AH");
//mp.remove(20);

for(Map.Entry k:mp.entrySet()) {
	System.out.println(k.getKey()+" "+k.getValue());
}

	}

}
