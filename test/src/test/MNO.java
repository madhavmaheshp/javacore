package test;
class MNO 
{
	void fun3()
	{
		ABC a1=new ABC();
		a1.fun1();
	}
	public static void main(String[] args) 
	{
		MNO m=new MNO();
		ABC a1=new ABC();
		m.fun3();
		a1.fun1();
		System.out.println("Hello World!");
	}
}
