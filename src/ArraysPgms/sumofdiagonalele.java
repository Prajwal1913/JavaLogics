package ArraysPgms;

public class sumofdiagonalele {
public static void main(String[] args) {
	int daisum=0;
	int[][]arr ={{1,2,3},{4,5,6},{7,8,9}};
	for (int i = 0; i < arr.length; i++) {
			daisum = daisum + arr[i][i];
	}
	System.out.println(daisum);
}
}
