package static1;

public class XYZ {

	static int x=20;
	static ABC a1=new ABC();
	ABC a2=new ABC();
	int y=30;
}
class Test2
{
	public static void main(String args[]) 
	{
		XYZ x1=new XYZ();
		x1.a2.fun2();
		x1.a1.fun3();
		System.out.println("Hello world");
	}
}