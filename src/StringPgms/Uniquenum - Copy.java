package Replace;

public class Uniquenum {
	public static void main(String[] args)
	{
	String str="java";
	char[] ch=str.toCharArray();
	//String[] str1 = str.split(" ");
	for(int i=0;i<ch.length;i++)
	{
		boolean flag=true;
		for(int j=0;j<ch.length;j++){
			if(ch[i]==ch[j] && i!=j)
			{
				flag=false;
				break;
			}
		
		}
		if(flag==true)
		{
			System.out.println(ch[i]);
		}
	
	}
		
	}
}
