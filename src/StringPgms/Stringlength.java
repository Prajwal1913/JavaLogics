package Arrays;
import java.util.*;
public class Stringlength {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string : ");
	String str =sc.nextLine();
	int x = Length(str);
	System.out.println("length of the string is : "+x);
}
static int Length(String str)
{
	char[] ch = str.toCharArray();
	int count =0;
	for(char c:ch)
	{
		count++;
	}
	return count;
}
}