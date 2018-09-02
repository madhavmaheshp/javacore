package callingfun;

public class A {

	public void fun1(int x)
	{
		int count=0;
		for(int i=0;i<x;i++)
		{
			count=count+i;
		}
		System.out.println("Sum of numbers"+count);
	}
}
