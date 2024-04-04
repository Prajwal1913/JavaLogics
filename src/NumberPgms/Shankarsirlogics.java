package Logics;

public class Shankarsirlogics {
	public static void main(String[] args) {
		int[] arr = {126, 769, 389, 361};
		int mid[] = new int[4];
		int count =0;
		int midadd =0;
		for(int i=0; i<arr.length;i++){
			int reversednum = returnnum(arr[i]);
			System.out.print(" "+ reversednum);
			mid[count] = midnum(reversednum);
			midadd = midadd+mid[count++];
		}
		System.out.println();
		for(int i:mid){
			System.out.print("   "+i);
		}
		System.out.println();
		System.out.println("the add of all the mid is -----> " +midadd);
		
	}
	static int returnnum(int no)
	{
		int reversednum = 0;
		while(no>0){
			int rem = no%100;
			reversednum = reversednum +rem;
			reversednum = reversednum*10+(no/100);
			no=no/1000;
		}
		return reversednum;
	}
	static int midnum(int no)
	{
		int midnum =0;
		while(no>0){
			int rem = no%100;
			midnum = midnum+rem;
			midnum = midnum/10;
			no=no/1000;
		}
		return midnum;
	}
}
