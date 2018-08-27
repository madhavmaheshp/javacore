package array;

public class Arraydemo4 {

	void fun1(int x)
	{
		System.out.println("Inside the fun1");
	}
	void fun2(String s)
	{
		System.out.println(s);
	}
	public static void main(String[] args) {
		Arraydemo4 ad=new Arraydemo4();
		ad.fun1(6);
		ad.fun2(new String());
		//ad.fun2();
	}

}
