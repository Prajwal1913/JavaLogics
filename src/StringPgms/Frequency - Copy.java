package Replace;
import java.util.*;
public class Frequency {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string: ");
	String str= sc.nextLine();
	int[] arr=new int[127];
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		arr[ch]++;
	}
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]!=0)
		{
			System.out.println((char)i+" -> "+arr[i]);
		}
	}
}
}
