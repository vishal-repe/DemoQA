package practice2;

public class string {

	public static void main(String[] args) {
		String s="manual testing";//string constant pool,reference=string constant pool
		String s1="Manual testing";
		String sn=new String("testing");//heap memory,string constant pool,reference=heap memory 
		String sn1=new String("testing");
		
	//	equal checks only content
		System.out.println(s.equals(s1));
		System.out.println(s.equals(sn));
		
	// == (double equals to) checks only reference
		System.out.println(s==s1);
		System.out.println(s==sn);
	
	//here equalsIgnoreCase ignores upper case,lower case in the content of two strings and checks the content	
		System.out.println(s.equalsIgnoreCase(s1));
		
		String s3="Automation";
		String s4=s3.concat(" testing");
		System.out.println(s3);
		System.out.println(s3 +" testing");
		System.out.println(s3==s4);
		
	//	here 10 & 20 are before String i.e.testing so considered as numbers 
		System.out.println(10+20 +" testing");
	// but here 10 & 20 are after String i.e. testing so considered as separate string and testing as another string	
		System.out.println("testing "+10+ 20);
		System.out.println(20+30+" testing "+10+ 20);
	}

}
