package Pekan8_2511533023;

public class QuickSort_2511533023 {
    
    static void swap_3023(int[] arr_3023, int i_3023, int j_3023) {
        int temp_3023 = arr_3023[i_3023];
        arr_3023[i_3023] = arr_3023[j_3023];
        arr_3023[j_3023] = temp_3023;
    }

    // Metode tambahan untuk mengatur pivot menggunakan Median-of-Three
    static void medianOfThree_3023(int[] arr_3023, int low_3023, int high_3023) {
        int mid_3023 = low_3023 + (high_3023 - low_3023) / 2;

        // Urutkan elemen low, mid, dan high
        if (arr_3023[low_3023] > arr_3023[mid_3023]) {
            swap_3023(arr_3023, low_3023, mid_3023);
        }
        if (arr_3023[low_3023] > arr_3023[high_3023]) {
            swap_3023(arr_3023, low_3023, high_3023);
        }
        if (arr_3023[mid_3023] > arr_3023[high_3023]) {
            swap_3023(arr_3023, mid_3023, high_3023);
        }

        swap_3023(arr_3023, mid_3023, high_3023);
    }

    static int partition_3023(int[] arr_3023, int low_3023, int high_3023) {
        // Panggil fungsi medianOfThree sebelum menentukan pivot
        medianOfThree_3023(arr_3023, low_3023, high_3023);

        int pivot_3023 = arr_3023[high_3023]; // Sekarang arr[high] sudah berisi nilai median
        int i_3023 = (low_3023 - 1);

        for (int j_3023 = low_3023; j_3023 <= high_3023 - 1; j_3023++) {
            // Jika elemen saat ini lebih kecil dari atau sama dengan pivot
            if (arr_3023[j_3023] < pivot_3023) {
                // Increment indeks elemen yang lebih kecil
                i_3023++;
                swap_3023(arr_3023, i_3023, j_3023);
            }
        }
        swap_3023(arr_3023, i_3023 + 1, high_3023);
        return (i_3023 + 1);
    }

    static void quickSort_3023(int[] arr_3023, int low_3023, int high_3023) {
        if (low_3023 < high_3023) {
            int pi_3023 = partition_3023(arr_3023, low_3023, high_3023);
            quickSort_3023(arr_3023, low_3023, pi_3023 - 1);
            quickSort_3023(arr_3023, pi_3023 + 1, high_3023);
        }
    }

    public static void printArr_3023(int[] arr_3023) {
        for (int i_3023 = 0; i_3023 < arr_3023.length; i_3023++) {
            System.out.print(arr_3023[i_3023] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr_3023 = {10, 7, 8, 9, 1, 5};
        int N_3023 = arr_3023.length;
        
        System.out.print("Data sebelum diurutkan: ");
        printArr_3023(arr_3023);

        quickSort_3023(arr_3023, 0, N_3023 - 1);

        System.out.print("Data Terurut quicksort: ");
        printArr_3023(arr_3023);
    }
}

