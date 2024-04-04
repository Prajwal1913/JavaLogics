package StringPgms;

public class reversestringusingcollections {
public static void main(String[] args) {
	String str="java";
	System.out.println(reverse(str));
}
static String reverse(String str){
	if(str.isEmpty()){
		return str;
	}else{
		return reverse(str.substring(1)) + str.charAt(0);
	}
}
}