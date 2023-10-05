package practice;

public class Array {

	public static void main(String[] args) {
//	int	a=1;
	int	b[]= {1,2,3,4,5};
	
/*	for(int i=0;i<5;i++) {
		System.out.println(b[i]);
			}
	for (int i=0;i<=b.length-1;i++) {
		 System.out.println(b[i]);
	 }
*/	
	for (int i=0;i<b.length;i++) {
		System.out.print(b[i]+ " ");
	}
	System.out.println();
	int c[]= new int[5];
	c[0]=10;
	c[1]=20;
	c[2]=30;
	c[3]=40;
	c[4]=50;
 for (int i=c.length-1;i>=0;i--) {
	 System.out.println(c[i]);
	 
 }
 System.out.println();
 int sum=0;
 for(int i=0;i<b.length;i++) {
	 sum=sum+b[i];
	 
 }
 System.out.println(sum);
	}

}
