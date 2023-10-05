package practice;

public class operator {

	public static void main(String[] args) {
		int i=10;
		int j=++i;
		System.out.println( "j "+ j);
		System.out.println("i "+ i);
		
        int k=20;
        int l=k++;
        System.out.println("l "+l);
        System.out.println("k "+k);
        
        int n=30;
        int m=--n;
        System.out.println("m "+m);
        System.out.println("n "+n);
        
        int a=40;
        int b=a--;
        System.out.println("b "+b);
        System.out.println("a "+a);
	}

}
