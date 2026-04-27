package Pekan4_2511533023;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseData_2511533023 {
    public static void main(String[] args) {
        Queue<Integer> q_3023 = new LinkedList<Integer>();
        q_3023.add(1);
        q_3023.add(2);
        q_3023.add(3); // [1, 2, 3]

        System.out.println("sebelum reverse" + q_3023);
        Stack<Integer> s_3023 = new Stack<Integer>();        
        // Proses Membalikkan Data: Q -> S
        while (!q_3023.isEmpty()) {
        	s_3023.push(q_3023.remove());
        }        
        // Proses Mengembalikan Data: S -> Q
        while (!s_3023.isEmpty()) {
        	q_3023.add(s_3023.pop());
        }
        System.out.println("sesudah reverse= " + q_3023); // [3, 2, 1]
    }
}
