package StringPgms;

public class Plaindromewithoutequals {
public static void main(String[] args) {
	boolean str= palindrome("javaj");
	if(str==true){
		System.out.println("palindorme");
	}else{
		System.out.println("not a palindrome");
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
