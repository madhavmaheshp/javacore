package polymorphism;

public class Staticpoly {

	void fun1(int x)
	{
		System.out.println("Inside the fun1(x)"+x);
	}
	void fun1(float y)
	{
		System.out.println("Inside the fun1(float )"+y);
	}
	public static void main(String[] args) {

		Staticpoly sp=new Staticpoly();
		sp.fun1(6);
	}

}
