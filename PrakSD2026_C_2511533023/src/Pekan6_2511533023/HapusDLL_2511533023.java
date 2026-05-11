package Pekan6_2511533023;

public class HapusDLL_2511533023 {
	public static NodeDLL_2511533023 delHead_3023(NodeDLL_2511533023 head_3023) {
		if(head_3023 == null) {
			return null;
		}
		NodeDLL_2511533023 temp = head_3023;
		head_3023 = head_3023.next_3023;
		if(head_3023 != null) {
			head_3023.prev_3023 = null;
		}
		return head_3023;
	}
	public static NodeDLL_2511533023 delLast_3023(NodeDLL_2511533023 head_3023) {
		if(head_3023 == null) {
			return null;
		}
		if (head_3023.next_3023 == null) {
			return null;
		}
		NodeDLL_2511533023 curr_3023 = head_3023;
		while(curr_3023.next_3023 != null) {
			curr_3023 = curr_3023.next_3023;
		}
		if(curr_3023.prev_3023.next_3023 != null) {
			curr_3023.prev_3023.next_3023 = null;
		}
		return head_3023;
	}
	// fungsi menghapus node posisi tertentu
    public static NodeDLL_2511533023 delPos_3023(NodeDLL_2511533023 head_3023, int pos_3023) {
        // jika DLL kosong
        if (head_3023 == null) {
            return head_3023;
        }
        NodeDLL_2511533023 curr_3023 = head_3023;
        // telusuri sampai ke node yang akan dihapus
        for (int i_3023 = 1; curr_3023 != null && i_3023 < pos_3023; ++i_3023) {
            curr_3023 = curr_3023.next_3023;
        }
        // jika posisi tidak ditemukan
        if (curr_3023 == null) {
            return head_3023;
        }
        // Update pointer
        if (curr_3023.prev_3023 != null) {
            curr_3023.prev_3023.next_3023 = curr_3023.next_3023;
        }
        if (curr_3023.next_3023 != null) {
            curr_3023.next_3023.prev_3023 = curr_3023.prev_3023;
        }
        // jika yang dihapus head
        if (head_3023 == curr_3023) {
            head_3023 = curr_3023.next_3023;
        }
        return head_3023;
    }

    // fungsi mencetak DLL
    public static void printList_3023(NodeDLL_2511533023 head_3023) {
    	NodeDLL_2511533023 curr_3023 = head_3023;
        while (curr_3023 != null) {
            System.out.print(curr_3023.data_3023 + " <-> ");
            curr_3023 = curr_3023.next_3023;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // buat sebuah DLL
    	NodeDLL_2511533023 head_3023 = new NodeDLL_2511533023(1);
        head_3023.next_3023 = new NodeDLL_2511533023(2);
        head_3023.next_3023.prev_3023 = head_3023;
        head_3023.next_3023.next_3023 = new NodeDLL_2511533023(3);
        head_3023.next_3023.next_3023.prev_3023 = head_3023.next_3023;
        head_3023.next_3023.next_3023.next_3023 = new NodeDLL_2511533023(4);
        head_3023.next_3023.next_3023.next_3023.prev_3023 = head_3023.next_3023.next_3023;
        head_3023.next_3023.next_3023.next_3023.next_3023 = new NodeDLL_2511533023(5);
        head_3023.next_3023.next_3023.next_3023.next_3023.prev_3023 = head_3023.next_3023.next_3023.next_3023;

        System.out.print("DLL Awal: ");
        printList_3023(head_3023);

        System.out.print("Setelah head dihapus: ");
        head_3023 = delHead_3023(head_3023);
        printList_3023(head_3023);

        System.out.print("Setelah node terakhir dihapus: ");
        head_3023 = delLast_3023(head_3023);
        printList_3023(head_3023);

        System.out.print("menghapus node ke 2: ");
        head_3023 = delPos_3023(head_3023, 2);
        printList_3023(head_3023);
    }
}


