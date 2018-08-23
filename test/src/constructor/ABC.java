package constructor;

public class ABC {

	int x,y,z;
	ABC()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	public static void main(String args[])
	{
		ABC a=new ABC();
		a.x=20;
		a.y=30;
		a.z=40;
		System.out.println(">>>>>>>>>....<<<<<<<<");
		System.out.println(a.x);
		System.out.println(a.y);
		System.out.println(a.z);

	}
}
