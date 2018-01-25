import java.util.Scanner;

class Sortarray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size,i,j;
		System.out.println("Enter array size: ");
		size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("\n Enter "+size+" elements: ");
		for(i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("\nUnsorted elements: ");
		for(i=0;i<size;i++) {
			System.out.println(arr[i]+" ");
		}
		for (i=0; i<size-1; i++) {
			for (j=0; j<size-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("\nSorted elements: ");
		for(i=0;i<size;i++) {
			System.out.println(arr[i]+" ");
		}
	}
}