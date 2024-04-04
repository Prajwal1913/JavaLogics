package Collections;

public class Chainingthis {
	Chainingthis(int a){
		System.out.println(a);
	}
	Chainingthis(String b){
		this(30);
		System.out.println(b);
	}
	Chainingthis(int a, String b){
		this("bye");
		System.out.println(a+ " " +b);
	}
	Chainingthis(String b , int a){
		this(20, "hello");
		System.out.println(b+ " " +a);
	}
	public static void main(String[] args) {
		Chainingthis d1 = new Chainingthis("hi", 10);
	}
}
