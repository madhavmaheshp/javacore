package static1;

public class B {

	static int x;
	int y;
	static void fun1()
	{
		System.out.println("Inside the static fun1");
	}
	void fun2() 
	{
		System.out.println("Inside the fun2");
	}
	public static void main(String args[])
	{
		B b1=null;
		b1=new B();
	    b1.fun2();
	    fun1();
	    B b2=new B();
	    B b3=new B();
	    x=10;
	    x=x+1;
	    System.out.println(x);
	    b2.y=10;
	    System.out.println(b3.y);
	}
}
