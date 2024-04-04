package Logics;

public class Palindromemethodwithargandreturntype {
public static void main(String[] args) {
	String str = "happy";
	String result = Palindrome(str);
	if(str.equals(result)){
		System.out.println("String is Palindrome");
	}else{
		System.out.println("String is not Palindrome");
	}
}
static String Palindrome(String str){
	String rev ="";
	for (int i = 0; i < str.length(); i++) {
		rev = rev + str.charAt(i);
	}
	return rev;
}
}
