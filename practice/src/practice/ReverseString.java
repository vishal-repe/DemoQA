package practice;

public class ReverseString {

	public static void main(String[] args) {
		String s="i am going to school";
		int len=s.length();
		System.out.println(len);
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println(s.charAt(12));
		
		for(int i=0;i<=len-1;i++) {
			System.out.print(s.charAt(i));
		}
		
	}

}
