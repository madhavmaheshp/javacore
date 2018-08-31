package commandline;

import org.xml.sax.Parser;

public class Commandline11 {

	public static void main(String args[])
	{
		if(args.length>3)
		{
			String p=args[0]; 
			String t=args[1];
			String r=args[2];
			float s1=Float.parseFloat(p);
			float s2=Float.parseFloat(t);
			float s3=Float.parseFloat(r);
			float s=(s1*s2*s3)/100;
			System.out.println(s);
		}
	}
}
