package test;

public class D 
{

	void fun1(B b1)
	{
		if(b1!=null)
		{
			b1.x=105;
			b1.funB();
		}
		else
		{
			System.out.println("B1 is null");
		}
	}
	public static void main(String args[])
	{
		D d1=new D();
		B b1=new B();
		d1.fun1(b1);
		System.out.println(b1.x);
		d1.fun1(new B());
		d1.fun1(null);
	}
}
