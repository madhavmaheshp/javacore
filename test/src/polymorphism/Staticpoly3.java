package polymorphism;

public class Staticpoly3 {

	void fun1(int x,int y)
	{
		System.out.println("Inside the fun1(x,y)"+x +y);
	}
	void fun1(int x,float y)
	{
		System.out.println("Inside the fun1(x,y)"+x +y);
	}
	void fun1(float x,int y)
	{
		System.out.println("Inside the fun1(x,y)"+x +y);
	}
	public static void main(String args[])
	{
		Staticpoly3 sp1=new Staticpoly3();
		sp1.fun1(6, 7);
		sp1.fun1(6, 7f);
		sp1.fun1(6f, 7);
	}
}
