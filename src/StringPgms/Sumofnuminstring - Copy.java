package Replace;

public class Sumofnuminstring {
	public static void main(String[] args)
	{
		int sum=0;
		String str="xy33z cd11e";
		String str1= str.replaceAll("[a-z]","");
		String [] s1= str1.split(" ");
		for(int i=0;i<s1.length;i++)
		{
		sum = sum+Integer.parseInt(s1[i]);
		}
		System.out.println(sum);
		add();
		sum();
}
	static void add()
	{
		String str="abc123xyz";
		String str1= str.replaceAll("[a-z]","");
		System.out.println(str1);
	}
static void sum()
{
	int sum=0;
	String str="7 11";
	String [] s1= str.split(" ");
	for(int i=0;i<s1.length;i++)
	{
	sum = sum+Integer.parseInt(s1[i]);
	}
	System.out.println(sum);
}
}
