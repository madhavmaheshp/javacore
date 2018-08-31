package interfaces;
public class B extends A
{
     void fun1()
	{
		System.out.println("Inside the fun1 of B");
	}
	public static void main(String[] args) {
			B b1=new B();
			b1.fun1();
			b1.x=20;
			System.out.println(b1.x);
	}

}
