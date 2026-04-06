package Pekan2_2511533023;

// 1. Tambahkan baris ini agar Java kenal apa itu ArrayList
import java.util.ArrayList; 

public class ArrayList1_2511533023 {
    public static void main(String[] args) {
        int n = 5;
        
        // 2. Gunakan "ArrayList" bawaan Java, bukan nama class kamu sendiri
        ArrayList<Integer> arrli = new ArrayList<>(); 
        
        for (int i = 1; i <= n; i++) {
            arrli.add(i);
        }
        
        System.out.println(arrli);
        
        // Menghapus elemen (hati-hati, remove(3) akan menghapus index ke-3)
        arrli.remove(3); 
        
        System.out.println(arrli);
        
        for (int i = 0; i < arrli.size(); i++) {
            System.out.print(arrli.get(i) + " ");
        }
    }
}
