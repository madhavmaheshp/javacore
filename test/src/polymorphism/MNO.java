package polymorphism;

public class MNO {

	void fun1()
	{
		System.out.println("Inside the fun1");
	}
	void fun1(int x)
	{
		System.out.println("Inside the fun1("+x+")");
	}
	void fun1(int x,int y)
	{
		System.out.println("Inside the fun1("+x+","+y+")");
	}
	public static void main(String args[])
	{
		MNO m1=new MNO();
		m1.fun1();
		m1.fun1(6);
		m1.fun1(6,7);
		
	}
}
