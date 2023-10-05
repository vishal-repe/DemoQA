package practice2;

//import java.util.ArrayList;
//import java.util.Iterator;

import java.util.*;

public class ary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ArrayList<Integer> ar=new ArrayList<Integer>();
//		LinkedList <Integer> l1=new LinkedList<Integer>();
//		Vector <String> v=new Vector<String>();push,pop,peek
		Stack<Object> st=new Stack<Object>();
		st.push("AS");
		st.push("12");
		st.push("c");
		st.push("13.5");
		st.push("100.5");
	//	System.out.println(" peek "+st.peek());
		

		

	//	System.out.println(" peek "+st.peek());
Iterator it=st.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}

//Object oj[]= {12.5,10,'C',"FF"};
	}

}
