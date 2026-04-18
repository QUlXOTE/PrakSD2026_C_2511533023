package Pekan3_2511533023;

import java.util.Stack;
import java.util.Scanner;

public class Browser_2511533023 {
    public static void main(String[] args) {
        // Menggunakan java.util.Stack dengan tipe objek Website_2511533023 
        Stack<Website_2511533023> riwayatStack = new Stack<>();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            // Tampilan Menu sesuai contoh output 
            System.out.println("\n= Browser History NIM: 2511533023 =");
            System.out.println("1. Kunjungi Website (Push)");
            System.out.println("2. Tombol Back (Pop)");
            System.out.println("3. Lihat Halaman Aktif (Peek)");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine(); // Clear buffer

            switch (pilihan) {
                case 1:
                    // Logika Push: Menambah data ke atas tumpukan 
                    System.out.print("Masukkan Judul: ");
                    String judul = input.nextLine();
                    System.out.print("Masukkan URL: ");
                    String url = input.nextLine();
                    
                    riwayatStack.push(new Website_2511533023(judul, url));
                    System.out.println("Berhasil mengunjungi halaman!");
                    break;

                case 2:
                    // Logika Pop: Menghapus halaman teratas 
                    // Penanganan agar tidak error saat stack kosong 
                    if (!riwayatStack.isEmpty()) {
                        Website_2511533023 dihapus = riwayatStack.pop();
                        System.out.println("Tombol Back ditekan. Menutup: " + dihapus.getJudul_3023());
                    } else {
                        System.out.println("Riwayat kosong! Tidak ada halaman untuk kembali.");
                    }
                    break;

                case 3:
                    // Logika Peek: Melihat halaman tanpa menghapus 
                    if (!riwayatStack.isEmpty()) {
                        Website_2511533023 aktif = riwayatStack.peek();
                        System.out.println("Halaman Aktif: " + aktif.getJudul_3023());
                        System.out.println("URL: " + aktif.getUrl_3023());
                    } else {
                        System.out.println("Tidak ada halaman yang sedang aktif.");
                    }
                    // Cek Status History (Jumlah total) 
                    System.out.println("Total riwayat tersimpan: " + riwayatStack.size());
                    break;

                case 4:
                    System.out.println("Keluar dari Browser...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 4);

        input.close();
    }
}
