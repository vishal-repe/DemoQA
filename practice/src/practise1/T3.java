package practise1;

public class T3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		put p=new put();
		p.p1();
		
		get g=new get();
		g.p1();
		g.p2();
		
		put p1=new get();// parent var=new child();
		//parent refering to child.
		p1.p1();
		p1.p2();
	
	}

}
