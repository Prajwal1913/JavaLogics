package ArraysPgms;

import java.util.Arrays;

public class Arraysmerge {
public static void main(String[] args) {
	int [] a={1,2,3};
	int [] b={4,5,6};
	int [] c=new int[a.length + b.length];
	int k=0;
	for (int i = 0; i < a.length; i++) {
			c[k]=a[i];
			k++;
		}
	for (int i = 0; i < b.length; i++) {
		c[k]=b[i];
		k++;
	}
	System.out.println(Arrays.toString(c));
}
}
