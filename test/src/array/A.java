package array;

public class A {
 public static void main(String args[])
 {
	 int ar[]=new int[6];
	 System.out.println(ar[0]);
	 ar[2]=35;
	 for(int i=0;i<ar.length;i++)
	 {
		 ar[i]=i*i;
	 }
	 for(int j=0;j<ar.length;j++)
	 {
		System.out.println(ar[j]);
	 }
 }
}
