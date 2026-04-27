package Pekan4_2511533023;

import java.util.Iterator;
import java.util.LinkedList; 
import java.util.Queue;      

public class IterasiQueue_2511533023 {
    public static void main(String[] args) {
        Queue<String> q_3023 = new LinkedList<>(); 
        
        q_3023.add("Praktikum");
        q_3023.add("Struktur");
        q_3023.add("Data");
        q_3023.add("Dan");
        q_3023.add("Algoritma");
        Iterator<String> iterator = q_3023.iterator();
        
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
