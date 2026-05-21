package Pekan7_2511533023;

import java.util.ArrayList;

public class SortingEngine_2511533023 {

    // 1. Algoritma Insertion Sort (Menggunakan format kata 'Langkah')
    public static ArrayList<String> insertionSort(Mahasiswa_2511533023[] arr_3023) {
        ArrayList<String> logs_3023 = new ArrayList<>();
        int n_3023 = arr_3023.length;
        
        logs_3023.add("=== INSERTION SORT ==="); 

        for (int i_3023 = 1; i_3023 < n_3023; i_3023++) {
            Mahasiswa_2511533023 key_3023 = arr_3023[i_3023];
            int j_3023 = i_3023 - 1;

            // Membandingkan string menggunakan compareToIgnoreCase() 
            while (j_3023 >= 0 && arr_3023[j_3023].getNama_3023().compareToIgnoreCase(key_3023.getNama_3023()) > 0) {
                arr_3023[j_3023 + 1] = arr_3023[j_3023];
                j_3023 = j_3023 - 1;
            }
            arr_3023[j_3023 + 1] = key_3023;
            
            
            logs_3023.add("Langkah " + i_3023 + ": " + arrayToString(arr_3023));
        }
        return logs_3023;
    }

    // 2. Algoritma Selection Sort (Menggunakan format kata 'Pass')
    public static ArrayList<String> selectionSort(Mahasiswa_2511533023[] arr_3023) {
        ArrayList<String> logs_3023 = new ArrayList<>();
        int n_3023 = arr_3023.length;

        logs_3023.add("=== SELECTION SORT ==="); 

        for (int i_3023 = 0; i_3023 < n_3023 - 1; i_3023++) {
            int minIdx_3023 = i_3023;
            for (int j_3023 = i_3023 + 1; j_3023 < n_3023; j_3023++) {
                if (arr_3023[j_3023].getNama_3023().compareToIgnoreCase(arr_3023[minIdx_3023].getNama_3023()) < 0) {
                    minIdx_3023 = j_3023;
                }
            }
            // Proses Swap data objek
            Mahasiswa_2511533023 temp_3023 = arr_3023[minIdx_3023];
            arr_3023[minIdx_3023] = arr_3023[i_3023];
            arr_3023[i_3023] = temp_3023;

            
            logs_3023.add("Pass " + (i_3023 + 1) + ": " + arrayToString(arr_3023));
        }
        return logs_3023;
    }

    // 3. Algoritma Bubble Sort (Menggunakan format kata 'Pass')
    public static ArrayList<String> bubbleSort(Mahasiswa_2511533023[] arr_3023) {
        ArrayList<String> logs_3023 = new ArrayList<>();
        int n_3023 = arr_3023.length;

        logs_3023.add("=== BUBBLE SORT ===");

        for (int i_3023 = 0; i_3023 < n_3023 - 1; i_3023++) {
            boolean swapped_3023 = false;
            for (int j_3023 = 0; j_3023 < n_3023 - i_3023 - 1; j_3023++) {
                if (arr_3023[j_3023].getNama_3023().compareToIgnoreCase(arr_3023[j_3023 + 1].getNama_3023()) > 0) {
                    Mahasiswa_2511533023 temp_3023 = arr_3023[j_3023];
                    arr_3023[j_3023] = arr_3023[j_3023 + 1];
                    arr_3023[j_3023 + 1] = temp_3023;
                    swapped_3023 = true;
                }
            }
           
            logs_3023.add("Pass " + (i_3023 + 1) + ": " + arrayToString(arr_3023));
            if (!swapped_3023) break; 
        }
        return logs_3023;
    }

    // Helper mengubah data array mahasiswa menjadi format string cetak nama
    private static String arrayToString(Mahasiswa_2511533023[] arr_3023) {
        StringBuilder sb_3023 = new StringBuilder("[");
        for (int i_3023 = 0; i_3023 < arr_3023.length; i_3023++) {
            sb_3023.append(arr_3023[i_3023].getNama_3023());
            if (i_3023 < arr_3023.length - 1) {
                sb_3023.append(", ");
            }
        }
        sb_3023.append("]");
        return sb_3023.toString();
    }
}
