package StringPgms;

public class subString {
public static void main(String[] args) {
//	String str1="Hello Java";
//	System.out.println(str1.substring(0, 5));
//	System.out.println(str1.substring(6));
//	System.out.println(str1.substring(0, 1));
//	System.out.println(str1.substring(1, 3));
//	System.out.println(str1.substring(3, 5));
//	System.out.println(str1.substring(6));
//	print("hello",3);
//	print("hello",1);
//	print("hello",4);
//	print("hello",2);
//}
	
//static void print(String str, int no){
//	for (int i = 0; i < no; i++) {
//		System.out.println(str.substring(str.length()-no));
//
//	}
	
//	String str = "knowledge";
//	String s1 = (str.substring(0,4));
//	String rev="";
//	for (int i = s1.length()-1;i>=0; i--) {
//		rev= rev+s1.charAt(i);
//	}
//	System.out.println(rev+str.substring(4));
	
//	String str3="helloll";
//	String s2 = str3.substring(2);
//	System.out.println(s2);
//	String rev="";
//	for (int i = s2.length()-1; i >=0; i--) {
//		rev = rev+s2.charAt(i);
//	}
//	if(rev.equals(s2)){
//		System.out.println("Palindrome");
//	}else{
//		System.out.println("Not a Palidrome");
//	}
	
String str = "java is programming language";	
int arr[] = new int[127];
for (int i = 0; i < str.length(); i++) {
	char ch = str.charAt(i);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
		arr[ch]++;
	}
}
for (int i = 0; i < arr.length; i++) {
	if(arr[i]!=0){
		System.out.println((char)i+"->"+arr[i]);
	}
}
}
}






















