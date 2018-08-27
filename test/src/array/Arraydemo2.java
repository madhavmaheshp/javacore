package array;

public class Arraydemo2 {

	public static void main(String args[])
	{
		int i[]= {1,2,3,4};
		String s[]= {"abc","xyz","mno"};
		System.out.println(i[(i.length)-1]);
		System.out.println(s[(s.length)-1]);
		A a1[]= {new A(),new A(),new A()};
		A a3=new A();
		A a4=new A();
		A a5=new A();
		A a2[]= {a3,a4,a5};
		System.out.println(a1[0]);
		System.out.println(a1[1 ]);
	}
}
