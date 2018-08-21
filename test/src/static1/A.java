package static1;

public class A {

	int x=10;
	static int y;
	void fun1()
	{
		System.out.println("Inside fun1()");
	}
	static void fun2()
	{
		System.out.println("Inside the fun2()");
	}
	public static void main(String args[])
	{
		A a1=new A();
		y=10;
		a1.fun1();
		fun2();
	}
}
