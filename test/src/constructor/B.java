package constructor;

public class B {

	int x;
	B()
	{
		this(6);
		System.out.println("Inside the B()");
	}
	B(int x)
	{
		this(x,x);
		System.out.println("Inside the B(int x)");
	}
	B(int x,int y)
	{
		System.out.println("Inside the B(x,y)");
	}
	void fun1()
	{
		this.x=15;
	}
	public static void main(String[] args) {
	
		B b=new B();
	}

}
