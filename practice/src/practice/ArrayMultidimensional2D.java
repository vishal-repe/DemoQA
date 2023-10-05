package practice;

public class ArrayMultidimensional2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]= {{2,3},
             {4,5}};

int b[][]=new int[2][2];
b[0][0]=10;
b[0][1]=20;
b[1][0]=30;
b[1][1]=40;

// for(int i=0;i<2;i++) {
//	for(int j=0;j<2;j++) {
// System.out.println(a[i][j]+" ");

 for (int i=0;i<a.length;i++) {
	for(int j=0;j<a[i].length;j++) {
		System.out.print(a[i][j]+" ");
	}
	System.out.println();
}
 for (int i=0;i<b.length;i++) {
		for(int j=0;j<b[i].length;j++) {
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
	}

	}
}
