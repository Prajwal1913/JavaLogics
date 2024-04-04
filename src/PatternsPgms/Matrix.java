package Pattern;

public class Matrix {
	public static void main(String[] args) throws InterruptedException
	{
		for(int row=1;row<=5;row++){
			for(int col=1;col<=5;col++){
				Thread.sleep(30);
				System.out.print("*");
			}
			System.out.println();
		}
	}
}