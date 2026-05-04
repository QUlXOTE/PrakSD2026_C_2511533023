package Pekan5_2511533023;

public class TambahSLL_2511533023 {
    public static NodeSLL_2511533023 insertAtFront(NodeSLL_2511533023 head, int value) {
        NodeSLL_2511533023 new_node = new NodeSLL_2511533023(value);
        new_node.next_3023 = head;
        return new_node;
    }

    // fungsi menambahkan node di akhir SLL
    public static NodeSLL_2511533023 insertAtEnd(NodeSLL_2511533023 head, int value) {
        // buat sebuah node dengan sebuah nilai
        NodeSLL_2511533023 newNode = new NodeSLL_2511533023(value);
        // jika list kosong maka node jadi head
        if (head == null) {
            return newNode;
        }
        // simpan head ke variabel sementara
        NodeSLL_2511533023 last = head;
        // telusuri ke node akhir
        while (last.next_3023 != null) {
            last = last.next_3023;
        }
        // ubah pointer
        last.next_3023 = newNode;
        return head;
    }

    static NodeSLL_2511533023 GetNode(int data) {
        return new NodeSLL_2511533023(data);
    }

    static NodeSLL_2511533023 insertPos(NodeSLL_2511533023 headNode, int position, int value) {
        NodeSLL_2511533023 head = headNode;
        if (position < 1)
            System.out.print("Invalid position");
        if (position == 1) {
            NodeSLL_2511533023 new_node = new NodeSLL_2511533023(value);
            new_node.next_3023 = head;
            return new_node;
        } else {
            while (position-- != 0) {
                if (position == 1) {
                    NodeSLL_2511533023 newNode = GetNode(value);
                    newNode.next_3023 = headNode.next_3023;
                    headNode.next_3023 = newNode;
                    break;
                }
                headNode = headNode.next_3023;
            }
            if (position != 1)
                System.out.print("Posisi di luar jangkauan");
        }
        return head;
    }

    public static void printList(NodeSLL_2511533023 head) {
        NodeSLL_2511533023 curr = head;
        while (curr.next_3023 != null) {
            System.out.print(curr.data_3023 + "-->");
            curr = curr.next_3023;
        }
        if (curr.next_3023 == null) {
            System.out.print(curr.data_3023);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // buat linked list 2->3->5->6
        NodeSLL_2511533023 head = new NodeSLL_2511533023(2);
        head.next_3023 = new NodeSLL_2511533023(3);
        head.next_3023.next_3023 = new NodeSLL_2511533023(5);
        head.next_3023.next_3023.next_3023 = new NodeSLL_2511533023(6);
        
        // cetak list asli
        System.out.print("Senarai berantai awal:");
        printList(head);
        
        // tambahkan node baru di depan
        System.out.print("tambah 1 simpul di depan: ");
        int data = 1;
        head = insertAtFront(head, data);
        
        // cetak update list
        printList(head);
        
        // tambahkan node baru di belakang
        System.out.print("tambah 1 simpul di belakang: ");
        int data2 = 7;
        head = insertAtEnd(head, data2);
        
        // cetak update list
        printList(head);
        
        System.out.print("tambah 1 simpul ke data 4: ");
        int data3 = 4;
        int pos = 4;
        head = insertPos(head, pos, data3);
        
        // cetak update list
        printList(head);
    }
}
