package interfaces;

public class interface1 implements XYZ,IJK{

	public void funX()
	{
		System.out.println("Func X inside the XYZ");
	}
	public void funY()
	{
		System.out.println("Func Y inside the XYZ");
	}
	public void funZ()
	{
		System.out.println("Func Z inside the XYZ");
	}
	public void funI()
	{
		System.out.println("Func I inside the IJK");
	}
	public void funJ()
	{
		System.out.println("Func J inside the IJK");
	}
	public void funK()
	{
		System.out.println("Func K inside the IJK");
	}
	public static void main(String args[])
	{
		interface1 i=new interface1();
		i.funI();
		i.funJ();
		i.funK();
		System.out.println(">>>>>>>>>>><<<<<<<<<<<");
		i.funX();
		i.funY();
		i.funZ();
	}
}
