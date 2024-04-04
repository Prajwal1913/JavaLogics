package Collections;
import java.util.ArrayList;
import java.util.Arrays;
public class Arraylisttoarray {
	public static void main(String[] args) {
		ArrayList a= new ArrayList();
		a.add(10);
		a.add(25);
		a.add("happy");
		a.add("hello");
		Object[] arr = new Object[a.size()];
		for (int i = 0; i < a.size(); i++) {
			arr[i]=a.get(i);
		}
		System.out.println(Arrays.toString(arr));
	}
}
