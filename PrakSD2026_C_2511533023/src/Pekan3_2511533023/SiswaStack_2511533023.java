package Pekan3_2511533023;

import java.util.ArrayList;

//Class untuk menyimpan data Siswa
class Siswa_2511533023 {
 String nama;
 int nim;

 public Siswa_2511533023(String nama, int nim) {
     this.nama = nama;
     this.nim = nim;
 }

 public String toString_3023() {
     return "Nim: " + nim + ", Nama: " + nama;
 }
}

//Class Utama untuk Struktur Data Stack
public class SiswaStack_2511533023 {
 // Tipe data di dalam ArrayList harus Siswa_2511533023
 private ArrayList<Siswa_2511533023> stack;

 public SiswaStack_2511533023() {
     stack = new ArrayList<>();
 }

 public void push_3023(Siswa_2511533023 mhs) {
     stack.add(mhs);
 }

 public Siswa_2511533023 pop_3023() {
     if (!isEmpty_3023()) {
         return stack.remove(stack.size() - 1);
     }
     return null;
 }

 public Siswa_2511533023 peek_3023() {
     if (!isEmpty_3023()) {
         return stack.get(stack.size() - 1);
     }
     return null;
 }

 public boolean isEmpty_3023() {
     return stack.isEmpty();
 }

 public void tampilkanSiswa_3023() {
     for (int i = stack.size() - 1; i >= 0; i--) {
         System.out.println(stack.get(i).toString_3023());
     }
 }

 public static void main(String[] args) {
     SiswaStack_2511533023 studentStack = new SiswaStack_2511533023();

     // Membuat objek dari class Siswa_2511533023, bukan SiswaStack
     Siswa_2511533023 mhs1 = new Siswa_2511533023("Ali", 1);
     Siswa_2511533023 mhs2 = new Siswa_2511533023("Boby", 2);
     Siswa_2511533023 mhs3 = new Siswa_2511533023("Charles", 3);

     studentStack.push_3023(mhs1);
     studentStack.push_3023(mhs2);
     studentStack.push_3023(mhs3);

     System.out.println("Siswa di dalam stack:");
     studentStack.tampilkanSiswa_3023();

     System.out.println("\nsiswa teratas : " + studentStack.peek_3023().toString_3023());
     
     Siswa_2511533023 popped = studentStack.pop_3023();
     System.out.println("mengeluarkan siswa teratas dari stack : " + popped.toString_3023());

     System.out.println("\ndaftar siswa setelah di pop :");
     studentStack.tampilkanSiswa_3023();
 }
}