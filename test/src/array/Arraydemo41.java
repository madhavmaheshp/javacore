package array;

public class Arraydemo41 {

	void fun1(int x[])
	{
		if(x==null||x.length==0)
		{
			System.out.println("Improper values");
		}
		else
		{
			System.out.println(x[x.length-1]);
		}
	}
	public static void main(String args[])
	{
		Arraydemo41 ad=new Arraydemo41();
		int x[]=new int[4];
		int y[]= {1,2,3,4};
		int z[]= {};
		ad.fun1(x);
		ad.fun1(y);
		ad.fun1(z);
		ad.fun1(null);
	}
}
