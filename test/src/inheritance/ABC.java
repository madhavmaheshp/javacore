package inheritance;

public  class ABC extends XYZ{

	void fun1()
	{
	   System.out.println("Inside the fun1 of abc");	
	}
	void fun3()
	{
		fun1();
		super.fun1();
	}
	public static void main(String[] args) {
	
		ABC a=new ABC();
		a.fun3();
	}

}
