package Pekan8_2511533023;

public class MergeSort_2511533023 {
    
    void merge_3023(int arr_3023[], int l_3023, int m_3023, int r_3023) {
        
        int n1_3023 = m_3023 - l_3023 + 1;
        int n2_3023 = r_3023 - m_3023;

        
        int L_3023[] = new int[n1_3023];
        int R_3023[] = new int[n2_3023];

        
        for (int i_3023 = 0; i_3023 < n1_3023; ++i_3023) {
            L_3023[i_3023] = arr_3023[l_3023 + i_3023];
        }
        for (int j_3023 = 0; j_3023 < n2_3023; ++j_3023) {
            R_3023[j_3023] = arr_3023[m_3023 + 1 + j_3023];
        }

        int i_3023 = 0, j_3023 = 0;

        
        int k_3023 = l_3023;
        while (i_3023 < n1_3023 && j_3023 < n2_3023) {
            if (L_3023[i_3023] <= R_3023[j_3023]) {
                arr_3023[k_3023] = L_3023[i_3023];
                i_3023++;
            } else {
                arr_3023[k_3023] = R_3023[j_3023];
                j_3023++;
            }
            k_3023++;
        }

        
        while (i_3023 < n1_3023) {
            arr_3023[k_3023] = L_3023[i_3023];
            i_3023++;
            k_3023++;
        }

        
        while (j_3023 < n2_3023) {
            arr_3023[k_3023] = R_3023[j_3023];
            j_3023++;
            k_3023++;
        }
    }

    void sort_3023(int arr_3023[], int l_3023, int r_3023) {
        if (l_3023 < r_3023) {
            // Find the middle point
            int m_3023 = (l_3023 + r_3023) / 2;

            // Sort first and second halves
            sort_3023(arr_3023, l_3023, m_3023);
            sort_3023(arr_3023, m_3023 + 1, r_3023);

            // Merge the sorted halves
            merge_3023(arr_3023, l_3023, m_3023, r_3023);
        }
    }

   
    static void printArray_3023(int arr_3023[]) {
        int n_3023 = arr_3023.length;
        for (int i_3023 = 0; i_3023 < n_3023; ++i_3023) {
            System.out.print(arr_3023[i_3023] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr_3023[] = {12, 11, 13, 5, 6, 7};
        System.out.println("Sebelum terurut");
        printArray_3023(arr_3023);

        MergeSort_2511533023 ob_3023 = new MergeSort_2511533023();
        ob_3023.sort_3023(arr_3023, 0, arr_3023.length - 1);

        System.out.println("\nSesudah Terurut menggunakan merge Sort");
        printArray_3023(arr_3023);
    }
}