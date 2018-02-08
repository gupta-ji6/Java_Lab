import java.util.Scanner;
 
class matrix {
	public static void main(String args[]) {
		int m, n, c, d;
		Scanner s = new Scanner(System.in);
		System.out.println("\nEnter the number of rows and columns of matrix");
		m = s.nextInt();
		n  = s.nextInt();
		int first[][] = new int[m][n];
		int second[][] = new int[m][n];
		int sum[][] = new int[m][n];
		int sub[][] = new int[m][n];
		System.out.println("\nEnter the elements of first matrix");
		for (  c = 0 ; c < m ; c++ )
			for ( d = 0 ; d < n ; d++ )
				first[c][d] = s.nextInt();
		System.out.println("\nEnter the elements of second matrix");
		for ( c = 0 ; c < m ; c++ )
			for ( d = 0 ; d < n ; d++ )
				second[c][d] = s.nextInt();
		for ( c = 0 ; c < m ; c++ ) {
			for ( d = 0 ; d < n ; d++ ) {
				sum[c][d] = first[c][d] + second[c][d];
				sub[c][d] = first[c][d] + second[c][d];
			}
		}
		System.out.println("\nSum of entered matrices:");
		for ( c = 0 ; c < m ; c++ ) {
			for ( d = 0 ; d < n ; d++ ) {
				System.out.print(sum[c][d]+"  ");
			}
			System.out.println();
		}
		System.out.println("\nDifference of entered matrices:");
		for ( c = 0 ; c < m ; c++ ) {
			for ( d = 0 ; d < n ; d++ ) {
				System.out.print(sub[c][d]+"  ");
			}
			System.out.println();
		}
    }
}
