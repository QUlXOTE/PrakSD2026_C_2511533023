package Pekan7_2511533023;

public class InsertionSort_2511533023 {
	public static void insertionSort_2511533023(int[] arr) {
		int n_3023 = arr.length;
		for(int i_3023 = 1; i_3023 < n_3023; i_3023++) {
			int key_3023 = arr[i_3023];
			int j_3023 = i_3023 - 1;
			while(j_3023 >= 0 && arr[j_3023] > key_3023) {
				arr[j_3023 + 1] = arr[j_3023];
				j_3023--;
			}
			arr[j_3023 + 1] = key_3023;
		}
	}
	public static void main(String[] args) {
		int arr[] = {23, 78, 45, 8, 32, 56, 1};
		int n_3023 = arr.length;
		System.out.printf("array yang belum terurut:\n");
		for(int i_3023 = 0; i_3023<n_3023; i_3023++)
			System.out.print(arr[i_3023] + " ");
		System.out.println("");
		insertionSort_2511533023(arr);
		System.out.printf("array yang terurut:\n");
		for(int i_3023 =0; i_3023 < n_3023; i_3023++)
			System.out.print(arr[i_3023] + " ");
		System.out.println("");
	}
}
