package ArraysPgms;

public class sumof2Darray {
public static void main(String[] args) {
	int sum=0;
	int[][]arr ={{1,2,3},{4,5,6},{7,8,9}};
	for (int row = 0; row < arr.length; row++) {
		for (int col = 0; col < arr[row].length; col++) {
			sum = sum + arr[row][col];
		}
	}
	System.out.println(sum);
}
}
