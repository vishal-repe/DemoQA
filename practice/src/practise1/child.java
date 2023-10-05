package practise1;

public class child extends parent{
	
	public void c1() {
		System.out.println("C1");
	}
	public static void c2() {
		System.out.println("C2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 test1 t=new test1();
  t.test();
  
 child cd=new child();  
 cd.c1();
 cd.c2();
 cd.p1();
 cd.p2();
 cd.gp1();
 cd.gp2();
 
 parent pt=new parent();
 pt.p1();
 pt.p2();
 pt.gp1();
 pt.gp2();
 
  grandparent p=new grandparent();
  p.gp1();
  p.gp2();
  p.ggp1();
  p.ggp2();
  
  greatgrandparent k=new greatgrandparent();
  k.ggp1();
  k.ggp2();

	}
}