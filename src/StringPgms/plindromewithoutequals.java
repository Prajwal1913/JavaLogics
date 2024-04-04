package Programmingmock;

public class plindromewithoutequals {
public static void main(String[] args) {
	boolean str = palindrome("momo");
	if(str==true){
		System.out.println("Palindrome");
	}else{
		System.out.println("Not a Palindrome");
	}
}
static boolean palindrome(String str){
	char[] ch = str.toCharArray();
	int a=ch.length-1;
	int b=0;
	while(a>b){
		if(ch[a]!=ch[b]){
			return false;
		}
		a--;
		b++;
		break;
	}
	return true;
}
}