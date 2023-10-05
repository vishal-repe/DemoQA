package practice2;

public class sbr {

	
// String buffer and string builder
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb=new StringBuffer("testing");
		sb.append(" manual");
		System.out.println(sb);
		System.out.println(sb.reverse());
		
		StringBuilder sb1=new StringBuilder("testing");
		sb1.append(" automation");
		System.out.println(sb1);
		System.out.println(sb1.reverse());

	}

}
