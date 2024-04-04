package Arrays;

import java.util.Set;
import java.util.*;
public class Originalvalues {
	public static void main(String[] args)
	{
		int[] arr={1,2,3,2,3,4,5,5};
		Set<Integer> s1=new TreeSet<Integer>();
		for(int no:arr)
		{
			s1.add(no);
		}
		System.out.println(s1);
	}
}
