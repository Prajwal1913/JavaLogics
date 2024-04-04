package Replace;

public class Fetching {
	public static void main(String[] args)
	{
		String str ="is the java is easy yes it is";
		String key ="is";
		int count =0;
		String[] str1= str.split(" ");
		for(int i=0;i<str1.length;i++)
		{
			if(str1[i].equals(key))
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
