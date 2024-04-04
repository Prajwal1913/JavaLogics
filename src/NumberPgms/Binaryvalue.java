package Binaryconverstion;

public class Binaryvalue {
	public static void main(String[] args)
	{
		for(int i=0;i<128;i++){
		int no=i;
		String n =" ";
		while(no!=0)
		{
			int rem=no%2;
			n=rem+n;
			no=no/2;
		}
		System.out.println(i+ " => " +n);
		}
		
	}
}
