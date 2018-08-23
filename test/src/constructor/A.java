package constructor;

public class A {
 
	int x,y;
	A()
	{
		System.out.println("Inside the constructor");
		System.out.println("Hello world");
	}
	void fun1()
	{
		System.out.println("inside the fun1()");
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String args[])
	{
		A a1=new A();
		a1.fun1();
	}
}
