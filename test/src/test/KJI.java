package test;

public class KJI {

	int x;
	KJI i=null;
	XYZ x1=new XYZ();
	public static void main(String args[])
	{
		KJI i=new KJI();
		i.i=new KJI();
		System.out.println("Completed");
	}
}
