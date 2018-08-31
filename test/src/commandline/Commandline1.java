package commandline;

public class Commandline1 {

	public static void main(String args[])
	{
		if(args.length>0)
		{
			for(int i=0;i<args.length;i++)
			{
				System.out.println(args[i]);
			}
		}
		else
		{
			System.out.println("zero content array has been entered");
		}
		System.out.println(args.length);
	}
}
