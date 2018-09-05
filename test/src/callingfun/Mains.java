package callingfun;

public class Mains {

	public static void mian(int args[])
	{
		System.out.println("Main 1");
	}
	public static void main(String  s)
	{
		System.out.println("Main 2");
	}
	public static void main(float f)
	{
		System.out.println("Main 3");
	}
	public static void main()
	{
		System.out.println("Defualt main");
	}
	public static void main(String args[])
	{
		main();
		main(6);
		main(0.355f);
		main("Hello");
		
	}
}
