package array;

public class A1 {

	public static void main(String[] args) {
		float ar1[]=new float[6];
		String ar2[]=new String[6];
		System.out.println(ar2[0]);
        ar2[1]="abc";
        System.out.println(ar1[1]);
        int len=ar2[1].length();
        System.out.println(len);
	}

}
