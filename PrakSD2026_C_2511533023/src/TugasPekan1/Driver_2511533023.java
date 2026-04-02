package TugasPekan1;

public class Driver_2511533023 {
    public static void main(String[] args) {

        ADTMobil_2511533023 dataMobil = new ADTMobil_2511533023();

        // contoh sesuai soal
        ADTMobil_2511533023 m1 = new ADTMobil_2511533023(
            "Avanza", 2020, 1300, 150000000, "Toyota"
        );

        // tambah mobil
        dataMobil.tambahMobil(m1);

        // tampilkan sebelum hapus
        System.out.println("Data Mobil:");
        dataMobil.tampilkanMobil();

        // hapus mobil
        dataMobil.hapusMobil(0);

        // tampilkan setelah hapus
        System.out.println("\nSetelah dihapus:");
        dataMobil.tampilkanMobil();
    }
}