package practice;

public class ifavg {

	public static void main(String[] args) {
		 int hin=20, eng=20,math=20;
		 int avg;
		 avg=(hin+eng+math)/3;
		 if (avg>=0 && avg<40) {
			 System.out.println("D grade");
		 }else if (avg>=40 && avg<60) {
			 System.out.println("C grade");
		 }else if (avg>=60 && avg<80) {
			 System.out.println("B grade");
		 }else if (avg>=80 && avg<100) {
			 System.out.println("A grade");
		 }

	}

}
