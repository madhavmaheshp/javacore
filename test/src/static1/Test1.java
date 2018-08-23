package static1;

public class Test1 {

	void fun1()
	{
		ABC.fun1();
		ABC.x=20;
	}
	public static void main(String args[])
	{
		Test1 t=new Test1();
		t.fun1();
		System.out.println(ABC.x);
	}
}
