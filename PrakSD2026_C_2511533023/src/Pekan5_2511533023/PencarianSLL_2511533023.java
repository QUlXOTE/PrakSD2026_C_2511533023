package Pekan5_2511533023;

public class PencarianSLL_2511533023 {
    static boolean searchKey_3023(NodeSLL_2511533023 head_3023, int key_3023) {
        NodeSLL_2511533023 curr_3023 = head_3023;
        while (curr_3023 != null) {
            if (curr_3023.data_3023 == key_3023)
                return true;
            curr_3023 = curr_3023.next_3023;
        }
        return false;
    }

    public static void traversal_3023(NodeSLL_2511533023 head_3023) {
        // mulai dari head
        NodeSLL_2511533023 curr_3023 = head_3023;
        // telusuri sampai pointer null
        while (curr_3023 != null) {
            System.out.print(" " + curr_3023.data_3023);
            curr_3023 = curr_3023.next_3023;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        NodeSLL_2511533023 head_3023 = new NodeSLL_2511533023(14);
        head_3023.next_3023 = new NodeSLL_2511533023(21);
        head_3023.next_3023.next_3023 = new NodeSLL_2511533023(13);
        head_3023.next_3023.next_3023.next_3023 = new NodeSLL_2511533023(30);
        head_3023.next_3023.next_3023.next_3023.next_3023 = new NodeSLL_2511533023(10);
        
        System.out.print("Penelusuran SLL : ");
        traversal_3023(head_3023);
        
        // data yang akan dicari
        int key_3023 = 30;
        System.out.print("cari data " + key_3023 + " = ");
        if (searchKey_3023(head_3023, key_3023))
            System.out.println("ketemu");
        else
            System.out.println("tidak ada");
    }
}
