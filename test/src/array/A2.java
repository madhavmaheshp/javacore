package array;

public class A2 {

   int[] fun1(int x)
	{
	   int ar1[]=null;
	   if(x>0)
		   ar1=new int[x];
	   return (ar1);
	}
   public static void main(String args[])
   {
	   A2 a1=new A2();
	   a1.fun1(6);
	   int ar[]=a1.fun1(5);
	   for(int i=0;i<ar.length;i++)
	   {
		   ar[i]=i+i;
	   System.out.println(ar[i]);
	   }
	   System.out.println(">>>>>>><<<<<<<");
	   System.out.println(ar.length);
	   System.out.println(">>>>>>><<<<<<<");
	   System.out.println(a1.fun1(4).length);
	   System.out.println(">>>>>>><<<<<<<");
	   System.out.println(a1);
	   System.out.println(">>>>>>><<<<<<<");
	   System.out.println(a1.fun1(5));
	   
   }
}