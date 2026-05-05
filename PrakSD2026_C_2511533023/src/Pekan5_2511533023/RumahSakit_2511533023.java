package Pekan5_2511533023;

import java.util.Scanner;

public class RumahSakit_2511533023 {
    private Pasien_2511533023 head_3023 = null;
    private int counter_3023 = 1;

    public void daftarkanPasien_3023(String nama_3023, String keluhan_3023) {
        Pasien_2511533023 baru_3023 = new Pasien_2511533023(nama_3023, keluhan_3023, counter_3023++);
        if (head_3023 == null) {
            head_3023 = baru_3023;
        } else {
            Pasien_2511533023 temp_3023 = head_3023;
            while (temp_3023.getNext_3023() != null) {
                temp_3023 = temp_3023.getNext_3023();
            }
            temp_3023.setNext_3023(baru_3023);
        }
        System.out.println("Pasien berhasil didaftarkan! Nomor Antrian: " + baru_3023.getNomorAntrian_3023());
    }

    public void panggilPasien_3023() {
        if (head_3023 == null) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Memanggil pasien: " + head_3023.getNamaPasien_3023());
            head_3023 = head_3023.getNext_3023();
        }
    }

    public void tampilkanAntrian_3023() {
        if (head_3023 == null) {
            System.out.println("Antrian kosong!");
            return;
        }
        Pasien_2511533023 temp_3023 = head_3023;
        while (temp_3023 != null) {
            System.out.println("[" + temp_3023.getNomorAntrian_3023() + "] " + temp_3023.getNamaPasien_3023() + " - " + temp_3023.getPenyakit_3023());
            temp_3023 = temp_3023.getNext_3023();
        }
    }

    public void cariPasien_3023(String nama_3023) {
        Pasien_2511533023 temp_3023 = head_3023;
        boolean ketemu_3023 = false;
        while (temp_3023 != null) {
            if (temp_3023.getNamaPasien_3023().equalsIgnoreCase(nama_3023)) {
                System.out.println("Pasien ditemukan: " + temp_3023.getNamaPasien_3023() + ", Keluhan: " + temp_3023.getPenyakit_3023());
                ketemu_3023 = true;
                break;
            }
            temp_3023 = temp_3023.getNext_3023();
        }
        if (!ketemu_3023) System.out.println("Pasien tidak ditemukan.");
    }

    public void cekStatus_3023() {
        if (head_3023 == null) {
            System.out.println("Antrian kosong.");
        } else {
            int total_3023 = 0;
            Pasien_2511533023 temp_3023 = head_3023;
            while (temp_3023 != null) { total_3023++; temp_3023 = temp_3023.getNext_3023(); }
            System.out.println("Total pasien: " + total_3023 + ". Pasien terdepan: " + head_3023.getNamaPasien_3023());
        }
    }

    public static void main(String[] args) {
        RumahSakit_2511533023 rs_3023 = new RumahSakit_2511533023();
        Scanner sc_3023 = new Scanner(System.in);
        int pilihan_3023 = 0;

        while (pilihan_3023 != 6) {
            System.out.println("\n=== Antrian Rumah Sakit NIM: 2511533023 ===");
            System.out.println("1. Daftarkan Pasien (Insert)");
            System.out.println("2. Panggil Pasien (Delete Head)");
            System.out.println("3. Tampilkan Antrian (Display)");
            System.out.println("4. Cari Pasien (Search)");
            System.out.println("5. Cek Status Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan_3023 = sc_3023.nextInt();
            sc_3023.nextLine(); 

            switch (pilihan_3023) {
                case 1:
                    System.out.print("Masukkan Nama Pasien: ");
                    String nama_3023 = sc_3023.nextLine();
                    System.out.print("Masukkan Keluhan : ");
                    String keluhan_3023 = sc_3023.nextLine();
                    rs_3023.daftarkanPasien_3023(nama_3023, keluhan_3023);
                    break;
                case 2: rs_3023.panggilPasien_3023(); break;
                case 3: rs_3023.tampilkanAntrian_3023(); break;
                case 4: 
                    System.out.print("Masukkan nama yang dicari: ");
                    rs_3023.cariPasien_3023(sc_3023.nextLine()); break;
                case 5: rs_3023.cekStatus_3023(); break;
                case 6: System.out.println("Keluar."); break;
                default: System.out.println("Pilihan tidak valid!");
            }
        }
        sc_3023.close();
    }
}
