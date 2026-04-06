package Pekan2_2511533023;

public class DaftarKataDriver_2511533023 {

    public static void main(String[] args) {
        // Membuat objek dari class yang sudah kita buat sebelumnya
        DaftarKata_2511533023 al = new DaftarKata_2511533023();

        // Menambah elemen (akhir)
        al.tambah("Kami");
        al.tambah("Informatika");

        // Menyisipkan elemen pada indeks 1
        al.tambahPada(1, "Mahasiswa");

        // Cetak isi awal
        System.out.println("Awal           : " + al);

        // Mengubah elemen (index 1)
        al.ubahElemen(1, "Departemen");
        System.out.println("Setelah Ubah   : " + al);

        // Menghapus elemen (hapus index 0)
        String terhapus = al.hapusElemen(0);
        System.out.println("Terhapus       : " + terhapus);
        System.out.println("Setelah Hapus  : " + al);

        // Iterasi pada ArrayList (cetak setiap elemen)
        System.out.print("Iterasi        : ");
        al.iterasiCetak();
        System.out.println();
    }
}
