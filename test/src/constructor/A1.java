package constructor;

public class A1 {

	int x;
	A1(int x)
	{
		this.x=x+this.x;
	}
	void fun1(int y)
	{
		int x=y;
		this.x=x+y;
	}
	public static void main(String args[])
	{
		A1 a=new A1(6);
		System.out.println(a.x);
		a.fun1(6);
		System.out.println(a.x);
	}
}
