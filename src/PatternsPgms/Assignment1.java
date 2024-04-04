package Pattern;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException
	{
		for(int row=1;row<=4;row++){
			for(int col=1;col<=row;col++){
				Thread.sleep(30);
				System.out.print("*");
				}
			for(int col=2*row;col<2*4;col++){
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++){
				Thread.sleep(30);
			System.out.print("*");
		    }
			System.out.println();
		}
	}
}