import java.util.Scanner;

class Display_matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int row = sc.nextInt();
		System.out.print("\nEnter number of columns: ");
		int col = sc.nextInt();
		int[][] arr = new int[row+1][col+1];
		int i,j;
		for (i=1; i<=row; i++) {
			for (j=1; j<=col; j++) {
				System.out.print("\nEnter "+i+j+"th element: ");
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.print("\nThe matrix is: \n");
		for (i=1; i<=row; i++) {
			for (j=1; j<= col; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}
