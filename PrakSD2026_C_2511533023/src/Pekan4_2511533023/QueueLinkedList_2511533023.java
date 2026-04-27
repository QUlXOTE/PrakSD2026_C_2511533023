package Pekan4_2511533023;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList_2511533023 {
    public static void main(String[] args) {
        // Menggunakan akhiran _3023 pada nama objek queue
        Queue<Integer> q_3023 = new LinkedList<>();

        // tambah elemen {0, 1, 2, 3, 4, 5} ke antrian
        for (int i = 0; i < 6; i++) {
            q_3023.add(i);
        }

        // Menampilkan isi antrian
        System.out.println("Elemen Antrian " + q_3023);

        // Untuk menghapus kepala antrian
        int hapus_3023 = q_3023.remove();
        System.out.println("Hapus elemen = " + hapus_3023);
        System.out.println(q_3023);

        // Untuk melihat antrian terdepan
        int depan_3023 = q_3023.peek();
        System.out.println("Kepala Antrian = " + depan_3023);

        int banyak_3023 = q_3023.size();
        System.out.println("Size Antrian = " + banyak_3023);
    }
}
