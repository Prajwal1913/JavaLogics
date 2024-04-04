package Collections;
import java.util.ArrayList;
import java.util.Arrays;
public class Addimplimentation {
	int DC = 10;
	int size =0;
	Object arr[] = new Object[DC];
	public void add(Object obj){
		Capacity();
		arr[size]=obj;
			size++;
	}
	public void Capacity(){
		if(size==arr.length)
		{
			int nc = (arr.length*3/2)+1;
			arr=Arrays.copyOf(arr, nc);
		}
	}
	public String toString(){
		StringBuilder s1 = new StringBuilder("[");
		for (int i = 0; i < size; i++) {
			s1.append(arr[i]);
			if(i<size-1){
				s1.append(",");
			}
		}
		s1.append("]");
		return s1.toString();
	}
	public static void main(String[] args) {
		Addimplimentation s = new Addimplimentation();
		s.add(20);
		s.add("sana");
		s.add(true);
		s.add(5.21);
		s.add(9);
		System.out.println(s.arr.length);
		System.out.println(s);
	}
}
