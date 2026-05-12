package Pekan6_2511533023;

import java.util.Scanner;

//Kelas Musik sesuai NIM lengkap 
public class Musik_2511533023 {
 private Lagu_2511533023 head_3023;
 private Lagu_2511533023 tail_3023;

 public Musik_2511533023() {
     this.head_3023 = null;
     this.tail_3023 = null;
 }

 // 1. Menambah lagu di AKHIR playlist 
 public void tambahLagu_3023(String judul, String penyanyi) {
     Lagu_2511533023 laguBaru = new Lagu_2511533023(judul, penyanyi);
     if (head_3023 == null) {
         head_3023 = tail_3023 = laguBaru;
     } else {
         tail_3023.next_3023 = laguBaru;
         laguBaru.prev_3023 = tail_3023;
         tail_3023 = laguBaru;
     }
     System.out.println("Lagu berhasil ditambahkan!");
 }

 // 2. Menghapus lagu pertama (head) 
 public void hapusLaguAwal_3023() {
     if (head_3023 == null) {
         System.out.println("Playlist kosong, tidak ada lagu untuk dihapus."); // 
         return;
     }
     if (head_3023 == tail_3023) {
         head_3023 = tail_3023 = null;
     } else {
         head_3023 = head_3023.next_3023;
         head_3023.prev_3023 = null;
     }
     System.out.println("Lagu pertama berhasil dihapus.");
 }

 // 3. Menampilkan semua lagu dari awal ke akhir 
 public void tampilMaju_3023() {
     if (head_3023 == null) {
         System.out.println("Playlist Kosong.");
         return;
     }
     Lagu_2511533023 temp = head_3023;
     System.out.println("\n--- Playlist (Maju) ---");
     while (temp != null) {
         System.out.println(temp.getJudul_3023() + " - " + temp.getPenyanyi_3023());
         temp = temp.next_3023;
     }
 }

 // 4. Menampilkan semua lagu dari akhir ke awal (DLL) 
 public void tampilMundur_3023() {
     if (tail_3023 == null) {
         System.out.println("Playlist Kosong.");
         return;
     }
     Lagu_2511533023 temp = tail_3023;
     System.out.println("\n--- Playlist (Mundur) ---");
     while (temp != null) {
         System.out.println(temp.getJudul_3023() + " - " + temp.getPenyanyi_3023());
         temp = temp.prev_3023;
     }
 }

 // 5. Mencari lagu berdasarkan judul (case-insensitive) 
 public void cariLagu_3023(String judul) {
     Lagu_2511533023 temp = head_3023;
     boolean ditemukan = false;
     while (temp != null) {
         if (temp.getJudul_3023().equalsIgnoreCase(judul)) {
             System.out.println("Lagu ditemukan: " + temp.getJudul_3023() + " | Penyanyi: " + temp.getPenyanyi_3023());
             ditemukan = true;
             break;
         }
         temp = temp.next_3023;
     }
     if (!ditemukan) System.out.println("Lagu '" + judul + "' tidak ditemukan.");
 }

 // Main method untuk menjalankan menu 
 public static void main(String[] args) {
     Musik_2511533023 playlist = new Musik_2511533023();
     Scanner input = new Scanner(System.in);
     int pilihan;

     do {
         System.out.println("\n=== Playlist Musik NIM: 2511533023 ===");
         System.out.println("1. Tambah Lagu");
         System.out.println("2. Hapus Lagu Pertama");
         System.out.println("3. Lihat Playlist (Maju)");
         System.out.println("4. Lihat Playlist (Mundur)");
         System.out.println("5. Cari Lagu");
         System.out.println("6. Keluar");
         System.out.print("Pilihan: ");
         pilihan = input.nextInt();
         input.nextLine(); // consume newline

         switch (pilihan) {
             case 1:
                 System.out.print("Judul: ");
                 String judul = input.nextLine();
                 System.out.print("Penyanyi: ");
                 String penyanyi = input.nextLine();
                 playlist.tambahLagu_3023(judul, penyanyi);
                 break;
             case 2:
                 playlist.hapusLaguAwal_3023();
                 break;
             case 3:
                 playlist.tampilMaju_3023();
                 break;
             case 4:
                 playlist.tampilMundur_3023();
                 break;
             case 5:
                 System.out.print("Masukkan Judul yang dicari: ");
                 String cari = input.nextLine();
                 playlist.cariLagu_3023(cari);
                 break;
             case 6:
                 System.out.println("Keluar program...");
                 break;
             default:
                 System.out.println("Pilihan tidak valid.");
         }
     } while (pilihan != 6);
     input.close();
 }
}
