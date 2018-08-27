package array;

public class Arraydemo1 {
	
	int ar1[]=new int[6];
	String ar2[];
    public static void main(String args[])
    {
    	Arraydemo1 ad=new Arraydemo1();
    	for(int i=0;i<ad.ar1.length;i++)
    	{
    		ad.ar1[i]=i*i;
    	}
    	ad.ar2=new String[5];
    	ad.ar2[0]="abc";
    	System.out.println(ad.ar2[0]);
    }
}
