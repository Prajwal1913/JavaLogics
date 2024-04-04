package Pattern;

public class Assignment2 {
	public static void main(String[] args) throws InterruptedException
	{
		for(int row=5;row>=1;row--){
			for(int col=row;col>=1;col--){
				Thread.sleep(30);
				System.out.print("*");
				}
			for(int col=2*row;col<2*5;col++){
				System.out.print(" ");
			}
			for(int col=row;col>=1;col--){
				Thread.sleep(30);
			System.out.print("*");
		    }
			System.out.println();
		}
	}
}
