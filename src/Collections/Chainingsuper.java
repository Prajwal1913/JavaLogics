package Collections;

class Tester{
	Tester(int a)
	{
		System.out.println(a);
	}
}
class Demo extends Tester{
	Demo(String b){
		super(10);
		System.out.println(b);
	}
}
class Chainingsuper{
	public static void main(String[] args) {
		Demo d1 = new Demo("happy");
	}
}
