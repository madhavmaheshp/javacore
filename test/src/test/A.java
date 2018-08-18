package test;
class A
{
	int x;char c;boolean flag;
	public static void main(String[] args) 
	{
		A a1=new A();
        A a2=new A();
		A a3=new A();
		if(a1==a2)
		System.out.println("a1 and a2 are equal");
		else
        System.out.println("a1 and a2 are unequal");
		A a4=a1;
		a4.x=10;
	    System.out.println(a1.x);
		System.out.println(a2.c);
		System.out.println(a3.flag);
	}
}
