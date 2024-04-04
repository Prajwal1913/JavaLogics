package StringPgms;

public class permutation {
public static void main(String[] args) {
	String str ="abc";
	permutation(str," ");
}
static void permutation(String str, String ans){
	if(str.length()==0){
		System.out.print(ans+" ");
	}
	for (int i = 0; i < str.length(); i++) {
		char ch = str.charAt(i);
		String res = str.substring(0,i) + str.substring(i+1);
		permutation(res,ans+ch);
	}
}
}