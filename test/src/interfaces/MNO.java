package interfaces;

public class MNO extends ABC {
	void fun2()
	{
		System.out.println("Inside the fun2() of MNO");
	}
    void fun3()
    {
    	fun2();
    	super.fun2();
    }
	public static void main(String[] args) {
		MNO m=new MNO();
		m.fun3();

	}

}
