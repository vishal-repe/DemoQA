package practice2;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
			      String str = "beautiful beach";
			      char[] carray = str.toCharArray();
			      System.out.println("The string is:" + str);
			      System.out.print("Duplicate Characters in above string are: ");
			      for (int i = 0; i < str.length(); i++) {
			         for (int j = i + 1; j < str.length(); j++) {
			            if (carray[i] == carray[j]) {
			               System.out.print(carray[j] + " ");
			               break;
			            }
			         }
			      }*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		
		int num= sc.nextInt();
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse Number is:"+ rev);
			   }
			
	}


