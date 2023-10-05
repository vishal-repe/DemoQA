package practice;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int a = 158;
		           int b=a;
				int revs=0;
				while(a!=0) {
				int	reminder=a%10;
				revs=revs*10+reminder;
				a=a/10;
				}
				System.out.print("reverse="+revs);
			if(b==revs){
		System.out.print("a is palindrome");
		}
		else{
			System.out.println();
		System.out.print("a is not palindrome");

	}

	}
}
