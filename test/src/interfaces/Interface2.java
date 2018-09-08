package interfaces;

public class Interface2 implements MNO {

	public static void main()
	{
		Interface2 i=new Interface2();
	   int z=i.x;
	   int z1=z+i.y;
	   System.out.println(i.z);
	   System.out.println(i.x);
	   System.out.println(i.y);
	}

	@Override
	public void funM() {
		System.out.println("Inside m");
		
	}

	@Override
	public void funN() {
		System.out.println("Inside n");
		
	}
}
