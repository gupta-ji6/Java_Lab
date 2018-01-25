import java.util.Scanner;

class Sum_of_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size,i,sum=0;
		System.out.println("Enter array size: ");
		size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("\n Enter "+size+" elements: ");
		for(i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		for (i=0; i<size; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum of elements is: "+ sum);
	}
}