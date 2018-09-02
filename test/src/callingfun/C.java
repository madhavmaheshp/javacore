package callingfun;

public class C extends A{

	public void fun1(int x)
	{
		int count=1;
		for(int i=1;i<x;i++)
		{
			count=count*i;
			System.out.println("Factorial of"+x+"is :"+count);
		}
	}
}
