package Collections;
import java.util.ArrayList;
public class Generics {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList();
		a.add(10);
		a.add(25);
		a.add(40);
		for(Object q:a)
		{
			System.out.println(q);
		}
	}
}
