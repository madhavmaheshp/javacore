package test;

class ABC 
{
	int x,y;
	void fun1()
	{
		System.out.println("Fun1");
	}
	void fun2()
	{
		System.out.println("fun2");
	}
}

class XYZ
{
	int x,y;
	void fun1()
	{
		System.out.println("Inside XYZ.fun1()");
	}
	void fun2()
	{
		System.out.println("Inside XYZ fun3()");
	}
}
class IJK
{
	void fun1()
	{
		System.out.println("Inside the fun4()");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
