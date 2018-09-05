package callingfun;

public class D extends A{

	public static void main(String args[])
	{
		int i=Integer.parseInt(args[0].trim());
		A a1=null;
		if(i>0 && i<20)
			a1=new B();
		if (i>20)
		{
			a1=new C();
		}
		if(i<0)
		{
			a1=new A();
		}
		a1.fun1(i);
		System.out.println("Hello World!");
	}
}
