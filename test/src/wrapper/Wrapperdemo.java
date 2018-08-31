package wrapper;

public class Wrapperdemo {

	void fun1(int p,int t,float r)
	{
		float s=(p*t*r)/100;
		System.out.println(s);
	}
	public static void main(String[] args) {
		Wrapperdemo w=new Wrapperdemo();
		if(args.length>=3)
		{
			String s=args[0];
			int p=Integer.parseInt(s.trim());
			int t=Integer.parseInt(args[1].trim());
			float r=Float.parseFloat(args[3].trim());
			w.fun1(p, t, r);
		}
		else
		{
			System.out.println("Improper vlaues");
		}

	}

}
