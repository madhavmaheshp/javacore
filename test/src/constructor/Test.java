package constructor;

public class Test {

	int x,y,z;
	Test(int x)
	{
		this.x=x;
 		System.out.println(x);
	}
	public static void main(String args[])
	{
	    Test t=new Test(6);	
	    System.out.println(t.x);
	}
}
