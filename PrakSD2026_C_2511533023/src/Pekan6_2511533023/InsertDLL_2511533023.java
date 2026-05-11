package Pekan6_2511533023;

public class InsertDLL_2511533023 {
    // menambah node di awal DLL
    static NodeDLL_2511533023 insertBegin_3023(NodeDLL_2511533023 head_3023, int data_3023) {
        // buat node baru
        NodeDLL_2511533023 new_node_3023 = new NodeDLL_2511533023(data_3023);
        // jadikan pointer nextnya head
        new_node_3023.next_3023 = head_3023;
        // jadikan pointer prev head ke new_node
        if (head_3023 != null) {
            head_3023.prev_3023 = new_node_3023;
        }
        return new_node_3023;
    }

    // fungsi menambahkan node di akhir
    public static NodeDLL_2511533023 insertEnd_3023(NodeDLL_2511533023 head_3023, int newData_3023) {
        // buat node baru
        NodeDLL_2511533023 newNode_3023 = new NodeDLL_2511533023(newData_3023);
        // jika dll null jadikan head
        if (head_3023 == null) {
            head_3023 = newNode_3023;
        } else {
            NodeDLL_2511533023 curr_3023 = head_3023;
            while (curr_3023.next_3023 != null) {
                curr_3023 = curr_3023.next_3023;
            }
            curr_3023.next_3023 = newNode_3023;
            newNode_3023.prev_3023 = curr_3023;
        }
        return head_3023;
    }

    // fungsi menambahkan node di posisi tertentu
    public static NodeDLL_2511533023 insertAtPosition_3023(NodeDLL_2511533023 head_3023, int pos_3023, int new_data_3023) {
        // buat node baru
        NodeDLL_2511533023 new_node_3023 = new NodeDLL_2511533023(new_data_3023);
        if (pos_3023 == 1) {
            new_node_3023.next_3023 = head_3023;
            if (head_3023 != null) {
                head_3023.prev_3023 = new_node_3023;
            }
            head_3023 = new_node_3023;
            return head_3023;
        }
        NodeDLL_2511533023 curr_3023 = head_3023;
        for (int i_3023 = 1; i_3023 < pos_3023 - 1 && curr_3023 != null; ++i_3023) {
            curr_3023 = curr_3023.next_3023;
        }
        if (curr_3023 == null) {
            System.out.println("Posisi tidak ada");
            return head_3023;
        }
        new_node_3023.prev_3023 = curr_3023;
        new_node_3023.next_3023 = curr_3023.next_3023;
        curr_3023.next_3023 = new_node_3023;
        if (new_node_3023.next_3023 != null) {
            new_node_3023.next_3023.prev_3023 = new_node_3023;
        }
        return head_3023;
    }

    public static void printList_3023(NodeDLL_2511533023 head_3023) {
        NodeDLL_2511533023 curr_3023 = head_3023;
        while (curr_3023 != null) {
            System.out.print(curr_3023.data_3023 + " <-> ");
            curr_3023 = curr_3023.next_3023;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // membuat dll 2 <-> 3 <-> 5
        NodeDLL_2511533023 head_3023 = new NodeDLL_2511533023(2);
        head_3023.next_3023 = new NodeDLL_2511533023(3);
        head_3023.next_3023.prev_3023 = head_3023;
        head_3023.next_3023.next_3023 = new NodeDLL_2511533023(5);
        head_3023.next_3023.next_3023.prev_3023 = head_3023.next_3023;

        // cetak DLL awal
        System.out.print("DLL Awal: ");
        printList_3023(head_3023);

        // tambah 1 di awal
        head_3023 = insertBegin_3023(head_3023, 1);
        System.out.print("simpul 1 ditambah di awal: ");
        printList_3023(head_3023);

        // tambah 6 di akhir
        System.out.print("simpul 6 ditambah di akhir: ");
        int data_3023 = 6;
        head_3023 = insertEnd_3023(head_3023, data_3023);
        printList_3023(head_3023);

        // menambah node 4 di posisi 4
        System.out.print("tambah node 4 di posisi 4: ");
        int data2_3023 = 4;
        int pos_3023 = 4;
        head_3023 = insertAtPosition_3023(head_3023, pos_3023, data2_3023);
        printList_3023(head_3023);
    }
}