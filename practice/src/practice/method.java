package practice;

public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
display();
method m1=new method();
    m1.display1();
   
    int sum=add(10,20,30);
    System.out.println(sum);
    System.out.println(add(50,40,60));
    
    
    int sum1=m1.add1(80, 70);
    System.out.println(sum1);
    System.out.println(m1.add1(150,40));
    
	}
public static void display () {
	System.out.println("display");
}
public void display1() {
	System.out.println("display1");
}
public static int add(int a, int b,int d) {
	int c=a+b;
	return c;
}
public  int add1(int a, int b) {
	int c=a+b;
	return c;
}
}
