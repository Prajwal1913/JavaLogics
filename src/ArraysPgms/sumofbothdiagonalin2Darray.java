package ArraysPgms;

public class sumofbothdiagonalin2Darray {
public static void main(String[] args) {
	int daiagonalsum=0;
	int daisum=0;
	int[][] arr= {{7,3,8},{12,18,9},{13,1,10}};
	for (int i = 0; i < arr.length; i++) {
		daisum = daisum + arr[i][i];
		daiagonalsum = daiagonalsum + arr[i][arr.length-1-i];
	}
	System.out.println(daisum - daiagonalsum);
	System.out.println(daiagonalsum - daisum);
}
}
