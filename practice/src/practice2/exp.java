package practice2;

public class exp {

	public static void main(String[] args) {	
 try {
		
	 int a[]=new int[4];
	  a[3]=20;
	 int i=10;		
		System.out.println(i/0);
		System.exit(0);
		System.out.println("try block");
}	
 catch(ArithmeticException ex) {
	System.out.println("child class");
	System.exit(2);
 }
 catch(Exception ex) {
	 System.exit(0);
	 		System.out.println("parent class"); 
 }

 finally {
	System.out.println("Finally block");
}
		
	}

}
