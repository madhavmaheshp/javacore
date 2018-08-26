package polymorphism;

public class Staticpoly2 {

	void fun1(int x)
	{
		System.out.println("Inside the fun1(x)"+x);
	}
	void fun1(float y)
	{
		System.out.println("Inside the fun1(y)"+y);
	}
	void fun1(long l)
	{
		System.out.println("Inside the fun1(l) long"+l);
	}
	public static void main(String[] args)
	{
       Staticpoly2 sp=new Staticpoly2();
       sp.fun1(6.0f);
       sp.fun1(7);
	}

}
