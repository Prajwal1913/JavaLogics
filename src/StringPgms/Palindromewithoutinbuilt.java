package Arrays;

public class Palindromewithoutinbuilt {
public static void main(String[] args) {
	String str="malayalam";
	boolean result = reverse(str);
	if(result==true)
	{
		System.out.println("string is palindrome");
	}else{
		System.out.println("string is not palindrome");
	}
}
static boolean reverse(String str)
{
	char[] ch=str.toCharArray();
	int i=0;
	int j=ch.length-1;
	while(i<=j){
		if(ch[i]!=ch[j])
		{
			return false;
		}
		i++;
		j--;
	}
	return true;
}
}