package TugasPekan2_2511533023;


import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511533023 {
    public static void main(String[] args) {
        // Implementasi ArrayList untuk mengelola data secara dinamis 
        ArrayList<Musik_2511533023> daftarMusik = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            // Tampilan Menu Utama 
            System.out.println("\n= Playlist Musik NIM: 2511533023 =");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Lihat Playlist");
            System.out.println("3. Hapus Lagu");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine(); // Membersihkan buffer

            switch (pilihan) {
                case 1:
                    // Tambah Lagu 
                    System.out.print("Masukkan Judul: ");
                    String judul = input.nextLine();
                    System.out.print("Masukkan Penyanyi: ");
                    String penyanyi = input.nextLine();
                    System.out.print("Masukkan Durasi (detik): ");
                    int durasi = input.nextInt();
                    
                    daftarMusik.add(new Musik_2511533023(judul, penyanyi, durasi));
                    System.out.println("Data berhasil ditambahkan!");
                    break;

                case 2:
                    // Lihat Playlist menggunakan looping 
                    System.out.println("\n--- Daftar Lagu ---");
                    if (daftarMusik.isEmpty()) {
                        System.out.println("Playlist kosong.");
                    } else {
                        for (int i = 0; i < daftarMusik.size(); i++) {
                            Musik_2511533023 m = daftarMusik.get(i);
                            System.out.println(i + ". " + m.getJudul_3023() + " - " + 
                                               m.getPenyanyi_3023() + " (" + 
                                               m.getDurasi_3023() + " detik)");
                        }
                    }
                    // Cek Kapasitas menggunakan method .size() 
                    System.out.println("Total lagu dalam playlist: " + daftarMusik.size());
                    break;

                case 3:
                    // Hapus Lagu berdasarkan nomor indeks 
                    System.out.print("Masukkan nomor indeks lagu yang akan dihapus: ");
                    int indeks = input.nextInt();
                    if (indeks >= 0 && indeks < daftarMusik.size()) {
                        daftarMusik.remove(indeks);
                        System.out.println("Lagu pada indeks tersebut berhasil dihapus!");
                    } else {
                        System.out.println("Indeks tidak valid!");
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 4);

        input.close();
    }
}