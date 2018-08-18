package test;

public class E {

	int fun1(int x)
	{
	 System.out.println(x);
	 return 1;
	}
	B fun2()
	{
		B b1=null;
		b1=new B();
		return(b1);
	}
	public static void main(String args[])
	{
		E e1=new E();
		e1.fun1(6);
		int z=e1.fun1(4);
		e1.fun2();
		B b1=e1.fun2();
		b1.funB();
	}
}
