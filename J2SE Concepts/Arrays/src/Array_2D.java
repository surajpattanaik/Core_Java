import java.util.Scanner;
public class Array_2D {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter row and column");
		int row=sc.nextInt();
		int col=sc.nextInt();
	    int arr[][]=new int [row][col]	;
	    input(arr);
	    display(arr);
	}
	private static void display(int[][] arr) {
		System.out.println("The array is....");
    	for (int i=0; i<arr.length; i++) {
    		for(int j=0; j<arr.length; j++) {
    			System.out.println(arr[i][j] + "\t");
    		}
    		System.out.println();
    	}
	}
	private static void input(int[][] arr) {
		for (int i=0; i<arr.length; i++) {
			System.out.println("Enter element for row "+i);
			for(int j=0; j<arr.length; j++) {
			arr [i][j]=sc.nextInt();
					
			}
		}
		
	}

}
