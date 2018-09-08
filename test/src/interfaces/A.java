package interfaces;

public class A implements XYZ{

	public void funX()
	{
		System.out.println("F1 in XYZ interface");
	}
	public void funY()
	{
		System.out.println("F2 in XYZ interface");
	}
	public void funZ()
	{
		System.out.println("F3 in XYZ interface");
	}
	public static void main(String[] args) {
		A a1=new A();
		a1.funX();
		a1.funY();
		a1.funZ();
	}

}
