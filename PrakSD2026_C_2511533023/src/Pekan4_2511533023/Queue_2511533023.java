package Pekan4_2511533023;

import java.util.Scanner;

public class Queue_2511533023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Kapasitas maksimal queue adalah 10 
        AntrianLoket_2511533023 loket_3023 = new AntrianLoket_2511533023(10);
        int pilih_3023;

        do {
            // Menampilkan menu utama antrean loket 
            System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
            System.out.println("1. Tambah Antrian"); 
            System.out.println("2. Hapus Antrian"); 
            System.out.println("3. Tampilkan Antrian"); 
            System.out.println("4. Reverse"); 
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            
            pilih_3023 = sc.nextInt();
            sc.nextLine(); 

            switch (pilih_3023) {
                case 1:
                    // Proses enqueue untuk menambah pelanggan 
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama_3023 = sc.nextLine();
                    loket_3023.enqueue_3023(nama_3023); 
                    break;
                case 2:
                    // Proses dequeue untuk menghapus pelanggan terdepan 
                    String dilayani_3023 = loket_3023.dequeue_3023();
                    if (dilayani_3023 != null) {
                        System.out.println(dilayani_3023 + " telah dilayani"); 
                    }
                    break;
                case 3:
                    // Menampilkan seluruh isi antrean saat ini
                    loket_3023.display_3023();
                    break;
                case 4:
                    // Membalikkan urutan antrean 
                    loket_3023.Reverse_3023();
                    break;
                case 5:
                    // Mengakhiri program 
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilih_3023 != 5);
        
        sc.close();
    }
}
