package static1;

public class ABC {

	int y=20;
	static int x=10;
	static void fun1()
	{
		System.out.println("Inside the fun1");
	}
	void fun2()
	{
		fun3();
		fun1();
		x=x+1;
	}
	void fun3()
	{
		System.out.println("Inside the fun3");
	}
	public static void main(String args[])
	{
		ABC a1=new ABC();
		
	}
}
