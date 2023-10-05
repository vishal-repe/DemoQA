package practise1;

//Interface

public class T5 extends T6 implements ite{// Syntax: Class1 extends Class2 implements interface.

	public static void main(String[] args) {
		
T5 t=new T5();
t.it();
t.display();
t.ite();
t.T6();

System.out.println(t.i); 

	}
 public void display() {
	System.out.println("display");
}
 public void it() {
	 System.out.println("it");
 }

public void ite() {
	System.out.println("ite");
	
}
}
