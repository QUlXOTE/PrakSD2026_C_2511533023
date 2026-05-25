package Pekan8_2511533023;

public class ShellSort_2511533023 {

    public static void shellSort_3023(int[] A_3023) {
        int n_3023 = A_3023.length;
        int gap_3023 = n_3023 / 2;
        while (gap_3023 > 0) {
            for (int i_3023 = gap_3023; i_3023 < n_3023; i_3023++) {
                int temp_3023 = A_3023[i_3023];
                int j_3023 = i_3023;
                while (j_3023 >= gap_3023 && A_3023[j_3023 - gap_3023] > temp_3023) {
                    A_3023[j_3023] = A_3023[j_3023 - gap_3023];
                    j_3023 = j_3023 - gap_3023;
                }
                A_3023[j_3023] = temp_3023;
            }
            gap_3023 = gap_3023 / 2;
        }
    }

    public static void main(String[] args) {
        int[] data_3023 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};

        System.out.print("Sebelum: ");
        printArray_3023(data_3023);

        shellSort_3023(data_3023);

        System.out.print("Sesudah (Shell Sort): ");
        printArray_3023(data_3023);
    }

    public static void printArray_3023(int[] arr_3023) {
        for (int i_3023 : arr_3023) { 
        	System.out.print(i_3023 + " ");
        
        }
        System.out.println();
       
    }
}
