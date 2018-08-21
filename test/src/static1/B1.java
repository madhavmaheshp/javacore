package static1;

public class B1 {

	static int x;
	int y;
	static void fun1()
	{
		System.out.println("Inside the fun1()");
	}
	void fun2()
	{
		System.out.println("Inside the fun2()");
	}
	public static void main(String args[])
	{
		B1 b=null;
		b=new B1();
		b.fun2();
		fun1();
		B1 b2=new B1();
		B1 b3=new B1();
		x=10;
		x=x+1;
		System.out.println(x);
		b2.y=10;
		System.out.println(b3.y);
	}
}
