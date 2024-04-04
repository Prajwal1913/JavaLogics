package ArraysPgms;

public class reverseof2Darray {
public static void main(String[] args) {
	int[][]arr ={{1,2,3},{4,5,6},{7,8,9}};
	for (int row = arr.length-1; row >=0; row--) {
		for (int col = arr[row].length-1; col >=0 ; col--) {
			System.out.print(arr[row][col]+" ");
		}
		System.out.println();
	}
	
}
}
