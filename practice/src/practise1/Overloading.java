package practise1;

public class Overloading {

	public static void main(String[] args) {
	Overloading t=new Overloading();
	int d= t.add(10,20,30,40);
	System.out.println("d "+d);
	display(); // static is called directly no need to create object.
	display(10);// value of integer i is given as 10.
	main(20);// value of int i is given as 20.
	
	main();
		
	//	int d=add(10,20,30,40);
	//	System.out.println("d "+d);
	//	float d=add(10.5f,20.5f);
	//	System.out.println("d "+d);

	}
public  int add(int a,int b) {
	int c=a+b;
	return c;
}

public  float add(float a,float b) {

 float c=a+b;
 return c;
}

public  int add(int a,int b,int n,int m) {
	int c=a+b+n+m;
	return c;
}
	
	public static void display() {
		System.out.println("dis_1");
	}
	
	public static void display(int i) {
		System.out.println("dis_2 "+i);
	}
	
	public static void main(int i) {
		System.out.println("main ="+i);
	}
	public static void main() {
		System.out.println("main ");
	}
}



