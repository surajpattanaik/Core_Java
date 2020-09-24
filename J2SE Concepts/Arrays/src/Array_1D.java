import java.util.Arrays;
import java.util.Scanner;
public class Array_1D {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		input(arr);
		display(arr);
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int index=Arrays.binarySearch(arr,11);  
		if(index>=0)
		
			System.out.println("Found at :"+index);
		
		else {
			System.out.println("not present.."); }
		 
		 int brr[]=Arrays.copyOfRange(arr,2,5);
		System.out.println("After copy: "+Arrays.toString(brr));
		System.out.println(Arrays.equals(arr,brr));
	}
	private static void display(int[]arr) {
		System.out.println("The Array is :");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i] +"\t");
		}
		System.out.println();
	}
	public static void input(int arr[]) {
		System.out.println("Enter array elements");
		for(int i=0; i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
	}
}

