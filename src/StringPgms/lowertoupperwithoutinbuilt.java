package Logics;

public class lowertoupperwithoutinbuilt {
//	 public static void main(String[] args) {
//	        String str = "java";
//	        char[] arr = str.toCharArray();
//	        for (int i = 0; i < arr.length; i++) {
//	            if (arr[i] >= 'a' && arr[i] <= 'z') {               
//	               arr[i] = (char) (arr[i] - 32);
//	            }
//	        }
//	       for (int i = 0; i < arr.length; i++) {
//	    	   System.out.print(arr[i]);
//		}
//	    }
	
	public static void main(String[] args) {
		 String str = "JAVA";
	        char[] arr = str.toCharArray();
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] >= 'A' && arr[i] <= 'Z') {               
	               arr[i] = (char)(arr[i]+32);
	            }
	        }
	       for (int i = 0; i < arr.length; i++) {
	    	   System.out.print(arr[i]);
		}
	}
}
