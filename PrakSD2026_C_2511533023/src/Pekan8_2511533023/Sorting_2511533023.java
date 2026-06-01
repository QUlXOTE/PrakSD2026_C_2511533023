package Pekan8_2511533023;


public class Sorting_2511533023 {

 // Array menggunakan tipe data kelas baru untuk menyimpan maksimal 20 lagu
 private Lagu_2511533023[] dataLagu_3023 = new Lagu_2511533023[20];
 private int jumlahLagu_3023 = 0;

 // Method untuk mengisi data awal (minimal 7 lagu)
 public void inputData_3023() {
     dataLagu_3023[0] = new Lagu_2511533023("Mio Cristo Piange Diamanti", "Penyanyi A", 270);
     dataLagu_3023[1] = new Lagu_2511533023("La Rumba Del Perdon", "Penyanyi B", 252);
     dataLagu_3023[2] = new Lagu_2511533023("La Perla", "Penyanyi C", 196);
     dataLagu_3023[3] = new Lagu_2511533023("Bohemian Rhapsody", "Queen", 355);
     dataLagu_3023[4] = new Lagu_2511533023("Fix You", "Coldplay", 295);
     dataLagu_3023[5] = new Lagu_2511533023("Perfect", "Ed Sheeran", 263);
     dataLagu_3023[6] = new Lagu_2511533023("As It Was", "Harry Styles", 167);
     jumlahLagu_3023 = 7; // Menandakan ada 7 data yang terisi
 }

 // Method utama Quick Sort (Mengurutkan berdasarkan Durasi Ascending)
 public void quickSort_3023(int low_3023, int high_3023) {
     if (low_3023 < high_3023) {
         int pi_3023 = partition_3023(low_3023, high_3023);

         // Rekursif untuk sub-array kiri dan kanan
         quickSort_3023(low_3023, pi_3023 - 1);
         quickSort_3023(pi_3023 + 1, high_3023);
     }
 }

 // Method pembantu partition untuk Quick Sort
 private int partition_3023(int low_3023, int high_3023) {
     // Menggunakan durasi_3023 dari lagu paling kanan sebagai pivot
     int pivot_3023 = dataLagu_3023[high_3023].durasi_3023;
     int i_3023 = (low_3023 - 1);

     for (int j_3023 = low_3023; j_3023 < high_3023; j_3023++) {
         // Urutkan berdasarkan durasi (terpendek ke terpanjang)
         if (dataLagu_3023[j_3023].durasi_3023 < pivot_3023) {
             i_3023++;
             // Swap dataLagu_3023[i_3023] dan dataLagu_3023[j_3023]
             Lagu_2511533023 temp_3023 = dataLagu_3023[i_3023];
             dataLagu_3023[i_3023] = dataLagu_3023[j_3023];
             dataLagu_3023[j_3023] = temp_3023;
         }
     }

     // Swap dataLagu_3023[i_3023 + 1] dan dataLagu_3023[high_3023] (pivot)
     Lagu_2511533023 temp_3023 = dataLagu_3023[i_3023 + 1];
     dataLagu_3023[i_3023 + 1] = dataLagu_3023[high_3023];
     dataLagu_3023[high_3023] = temp_3023;

     return i_3023 + 1;
 }

 // Method untuk menampilkan data playlist lagu
 public void tampilData_3023() {
     for (int i_3023 = 0; i_3023 < jumlahLagu_3023; i_3023++) {
         System.out.println((i_3023 + 1) + ". " + dataLagu_3023[i_3023].judul_3023 + " - " + dataLagu_3023[i_3023].durasi_3023 + " detik");
     }
 }

 // Main Method untuk menjalankan program utama
 public static void main(String[] args) {
     Sorting_2511533023 program_3023 = new Sorting_2511533023();
     
     // 1. Input data awal lagu
     program_3023.inputData_3023();

     System.out.println("==Sorting Playlist NIM: 2511533023==");
     System.out.println("Pilih Algoritma (1 = Shell, 2 = Quick, 3 = Merge): 2");
     System.out.println();

     // 2. Menampilkan data sebelum diurutkan
     System.out.println("Data Sebelum Sorting:");
     program_3023.tampilData_3023();
     System.out.println();

     // 3. Memproses pengurutan dengan algoritma Quick Sort
     program_3023.quickSort_3023(0, program_3023.jumlahLagu_3023 - 1);

     // 4. Menampilkan data setelah diurutkan
     System.out.println("Data Setelah Quick Sort (Durasi Asc):");
     program_3023.tampilData_3023();
 }
}
