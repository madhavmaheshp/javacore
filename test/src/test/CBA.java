package test;

public class CBA {
 
	int x=10;
	XYZ x1=new XYZ();
	public static void main(String args[])
	{
		CBA c=new CBA();
		c.x1.fun1();
		System.out.println("Hello world");
		c.x1.y=20;
		System.out.println(c.x1.y);
		c.x1=new XYZ();
		System.out.println(c.x1.y);
	}
}
