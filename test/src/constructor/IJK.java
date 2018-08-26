package constructor;

public class IJK {

	int i,j,k;
	IJK(int x)
	{
		i=x; 
		j=x*x;
		k=i+j;
	}
	IJK()
	{
		System.out.println(i+j+k);
	}
	public static void main(String args[])
	{
		IJK m=new IJK(6);
		System.out.println(m.i);
		System.out.println(m.j);
		System.out.println(m.k);
	}
}
