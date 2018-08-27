package test;

public class Test {
	public static void main(String args[])
	{

	  String s1="abc";
	  String s2="xyz";
	  if(s1==s2)
	  {
	    System.out.println("s1 & s2 are equal");	
	  }
	  if(s1!=s2)
	  {
		  System.out.println("s1 and s2 are not equal");
	  }
	  
	  String  s3=new String("xyz");
	  String s4=new String("xyz");
	  if(s3==s4)
	  {
		  System.out.println("Both s3 and s4 are equal");
	  }
	  if(s3!=s4)
	  {
		  System.out.println("Not equal");
	  }
	  System.out.println(s1);
	  System.out.println(s2);
	  System.out.println(s3);
	  System.out.println(s4);
	}	
}
