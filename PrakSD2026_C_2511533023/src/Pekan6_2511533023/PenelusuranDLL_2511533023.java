package Pekan6_2511533023;

public class PenelusuranDLL_2511533023 {
	static void forwardTraversal_3023(NodeDLL_2511533023 head_3023) {
		NodeDLL_2511533023 curr_3023 = head_3023;
		while (curr_3023 != null) {
			System.out.print(curr_3023.data_3023 + " <-> ");
			curr_3023 = curr_3023.next_3023;
		}
		System.out.println();
	}
	static void backwardTraversal_3023(NodeDLL_2511533023 tail_3023) {
		NodeDLL_2511533023 curr_3023 = tail_3023;
		while(curr_3023 != null) {
			System.out.print(curr_3023.data_3023 + " <-> ");
			curr_3023 =curr_3023.prev_3023;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		NodeDLL_2511533023 head_3023 = new NodeDLL_2511533023(1);
		NodeDLL_2511533023 second_3023 = new NodeDLL_2511533023(2);
		NodeDLL_2511533023 third_3023 = new NodeDLL_2511533023(3);
		
		head_3023.next_3023 = second_3023;
		second_3023.prev_3023 = head_3023;
		second_3023.next_3023 = third_3023;
		third_3023.prev_3023 = second_3023;
		
		System.out.println("Penelusuran maju:");
        forwardTraversal_3023(head_3023);

        System.out.println("Penelusuran mundur:");
        backwardTraversal_3023(third_3023);
		
	}

}
