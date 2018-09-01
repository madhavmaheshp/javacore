package callingfun;

public class Base extends Subtest1 {

	Base()
	{
		super(6);
	}
	void fun1()
	{
		System.out.println("Inside the base fun1");
	}
	void fun2()
	{
		super.fun1();
	}
	public static void main(String args[])
	{
		Base b=new Base();
		b.fun1();
		b.fun2();
	}
}
