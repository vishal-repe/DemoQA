package practice;

public class string_rev_without_rev {

	public static void main(String[] args) {
		String str= "Hello ,World!";
		String reversedStr= reverseString(str);
		System.out.println(reversedStr);
		
	}
	public static String reverseString(String str) {
		StringBuilder reversed = new StringBuilder();
		
		for(int i=str.length()-1;i>=0;i--) {
			reversed.append(str.charAt(i));
		}
		return reversed.toString();
	}

	
	}


