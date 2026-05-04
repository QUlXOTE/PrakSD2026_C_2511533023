package Pekan5_2511533023;

public class HapusSLL_2511533023 {
    // fungsi untuk menghapus head
    public static NodeSLL_2511533023 deleteHead_3023(NodeSLL_2511533023 head_3023) {
        // jika SLL kosong
        if (head_3023 == null)
            return null;
        // pindahkan head ke node berikutnya
        head_3023 = head_3023.next_3023;
        // Return head baru
        return head_3023;
    }

    // fungsi menghapus node terakhir SLL
    public static NodeSLL_2511533023 removeLastNode_3023(NodeSLL_2511533023 head_3023) {
        // jika list kosong, return null
        if (head_3023 == null) {
            return null;
        }
        // jika list satu node, hapus node dan return null
        if (head_3023.next_3023 == null) {
            return null;
        }
        // temukan node terakhir ke dua
        NodeSLL_2511533023 secondLast_3023 = head_3023;
        while (secondLast_3023.next_3023.next_3023 != null) {
            secondLast_3023 = secondLast_3023.next_3023;
        }
        // hapus node terakhir
        secondLast_3023.next_3023 = null;
        return head_3023;
    }

    // fungsi menghapus node di posisi tertentu
    public static NodeSLL_2511533023 deleteNode_3023(NodeSLL_2511533023 head_3023, int position_3023) {
        NodeSLL_2511533023 temp_3023 = head_3023;
        NodeSLL_2511533023 prev_3023 = null;
        // jika linked list null
        if (temp_3023 == null)
            return head_3023;
        // kasus 1: head dihapus
        if (position_3023 == 1) {
            head_3023 = temp_3023.next_3023;
            return head_3023;
        }
        
        for (int i_3023 = 1; temp_3023 != null && i_3023 < position_3023; i_3023++) {
            prev_3023 = temp_3023;
            temp_3023 = temp_3023.next_3023;
        }
        // jika ditemukan, hapus node
        if (temp_3023 != null) {
            prev_3023.next_3023 = temp_3023.next_3023;
        } else {
            System.out.println("Data tidak ada");
        }
        return head_3023;
    }

    // fungsi mencetak SLL
    public static void printList_3023(NodeSLL_2511533023 head_3023) {
        NodeSLL_2511533023 curr_3023 = head_3023;
        while (curr_3023.next_3023 != null) {
            System.out.print(curr_3023.data_3023 + "-->");
            curr_3023 = curr_3023.next_3023;
        }
        if (curr_3023.next_3023 == null) {
            System.out.print(curr_3023.data_3023);
        }
        System.out.println();
    }

    // kelas main
    public static void main(String[] args) {
        // buat SLL 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
        NodeSLL_2511533023 head_3023 = new NodeSLL_2511533023(1);
        head_3023.next_3023 = new NodeSLL_2511533023(2);
        head_3023.next_3023.next_3023 = new NodeSLL_2511533023(3);
        head_3023.next_3023.next_3023.next_3023 = new NodeSLL_2511533023(4);
        head_3023.next_3023.next_3023.next_3023.next_3023 = new NodeSLL_2511533023(5);
        head_3023.next_3023.next_3023.next_3023.next_3023.next_3023 = new NodeSLL_2511533023(6);
        
        // cetak list awal
        System.out.println("list awal: ");
        printList_3023(head_3023);
        
        // hapus head
        head_3023 = deleteHead_3023(head_3023);
        System.out.println("List setelah head dihapus: ");
        printList_3023(head_3023);
        
        // hapus node terakhir
        head_3023 = removeLastNode_3023(head_3023);
        System.out.println("List setelah simpul terakhir di hapus: ");
        printList_3023(head_3023);
        
        // Deleting node at position 2
        int position_3023 = 2;
        head_3023 = deleteNode_3023(head_3023, position_3023);
        
        // Print list after deletion
        System.out.println("List setelah posisi 2 dihapus: ");
        printList_3023(head_3023);
    }
}