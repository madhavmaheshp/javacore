package interfaces;

public class Interfaces2 implements ABC {

	public void funA()
	{
		System.out.println("This in ABC interface");
	}
	public void funB()
	{
		System.out.println("This in ABC interface");
	}
	public void funX()
	{
		System.out.println("This in XYZ interface");
	}
	public void funY()
	{
		System.out.println("This in XYZ interface");
	}
	public void funZ()
	{
		System.out.println("This in XYZ interface");	
	}
	public void funI()
	{
		System.out.println("This in IJK interface");
	}
	public void funJ()
	{
		System.out.println("This in IJK interface");
	}
	public void funK()
	{
		System.out.println("This in IJK interface");
	}
	public static void main(String args[])
	{
		Interfaces2 i=new Interfaces2();
		 i.funA();
	}
}
