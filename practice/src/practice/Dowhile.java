package practice;

public class Dowhile {

	public static void main(String[] args) {
	/*	int i=1;
		do {
			System.out.println(i);
			i++;
		}
		while (i<=10);
	*/
		// Table of 5
	/*	int i=1;
		do {
			System.out.println(5*i);
			i++;
		}
		while(i<=10);
		
	*/// SUMMATION
	/*	
		int i=1,sum=0;
		do {
			sum=sum+i;
			i++;
		}
		while(i<=50);
		System.out.println(sum);
	*/
		int i=1,fact=1;
		do {
			fact=fact*i;
			i++;
		}
		while(i<=5);
		System.out.println(fact);
	}

}
