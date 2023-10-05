package practice;

public class ReverseSting1 {

	public static void main(String[] args) {
		String s= "i am vishal";
		int l=s.length();
		System.out.println(l);
		
		for(int i=0;i<=l-1;i++) {
			System.out.print(s.charAt(i));
		}
		
		System.out.println();
		
		for(int i=l-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		
			
	}

}
