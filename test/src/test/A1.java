package test;
public class A1 {

	void fun1(int x)
	{
		System.out.println(x);
	}
	void fun2(B b1)
	{
		b1.funB();
	}
	B b2=new B();
	String x= b2.funB1();
	public static void main(String args[])
	{
		A1 a1=new A1();
		a1.fun1(6);
		B b1=new B();
		System.out.println(b1.x);
	
	}
}
