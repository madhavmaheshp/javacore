package static1;

public class A1 {

	int x=10;
	static int y;
	void fun1()
	{
		System.out.println("Inside the fun1");
	}
	static void fun2()
	{
		y=y+1;
		System.out.println("Inside the fun2");
		A1 a=new A1();
		a.fun1();
		a.x=y+1;
		System.out.println(a.x);
	}
	public static void main(String args[])
	{
		y=y+1;
		A1 a1=new A1();
		a1.fun1();
		fun2();
		System.out.println(a1.x);
		System.out.println(y);
	}
}
