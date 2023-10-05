package practise1;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 test1 t=new test1();
  t.test();
  
/*child cd=new child();  
 cd.c1();
 cd.c2();
 cd.p1();
 cd.p2();
 cd.gp1();
 cd.gp2();
 */
 parent pt=new parent();
 pt.p1();
 pt.p2();
 pt.gp1();
 pt.gp2();

	}
 public void test() {
	 System.out.println("test");
 }
 
}
