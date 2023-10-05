package practice2;

//Constructor

public class sct {
//Below constructor has no parameter 	
  sct(){
	  System.out.println("Default");
	  sct1();
	  
  }
 //Below constructor has parameter 
	sct(String s,String s1){
		System.out.println("parameterized" +s +s1);
		sct1();
	}
	sct(int i){
		System.out.println("parameterized" + i);
		sct1();
	}
	
	public void sct1() {
		System.out.println("method");
	}
	public void sct2() {
		sct1();
		System.out.println("method 2");
	}
}
