import java.util.*;
class MatrixAddition
{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter dimension");
	int rows = sc.nextInt();
	int colms = sc.nextInt();
    int a[][] = new int[rows][colms];
	int b[][] = new int[rows][colms];

	      System.out.println("Enter array a elements");
	for (int i=0; i<rows; i++ ){
		for(int j=0; i<colms; j++){
      
			a[i][j] =sc.nextInt();
		}
	
	}

	     System.out.println("Enter array b elements");
    for (int i=0; i<rows; i++ ){
		for(int j=0; i<colms; j++){
           
			b[i][j]  =sc.nextInt();
		}
	
	}
	int[][] c = new int[rows][colms];

	 for (int i=0; i<rows; i++ ){
		for(int j=0; i<colms; j++){
            c[i][j]  = a[i][j]+b[i][j];
			
		}
	}

	System.out.println("reslut array c is: ");

   for (int i=0; i<rows; i++ ){
		for(int j=0; i<colms; j++){

	System.out.print(c[i][j]);
		}
		 System.out.println();
   }
	
	}
}