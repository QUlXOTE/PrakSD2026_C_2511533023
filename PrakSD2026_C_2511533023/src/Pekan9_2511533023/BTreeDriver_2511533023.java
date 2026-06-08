package Pekan9_2511533023;

public class BTreeDriver_2511533023 {
    public static void main(String[] args) {
        //Membuat Pohon
        BTree_2511533023 tree = new BTree_2511533023();
        System.out.print("Jumlah Simpul awal pohon: ");
        System.out.println(tree.countNodes_3023());
        //menambahkan simpul data 1
        Node_2511533023 root = new Node_2511533023(1);
        //menjadikan simpul 1 sebagai root
        tree.setRoot(root, root);
        System.out.println("Jumlah simpul jika hanya ada root");
        System.out.println(tree.countNodes_3023());
        Node_2511533023 node2 = new Node_2511533023(2);
        Node_2511533023 node3 = new Node_2511533023(3);
        Node_2511533023 node4 = new Node_2511533023(4);
        Node_2511533023 node5 = new Node_2511533023(5);
        Node_2511533023 node6 = new Node_2511533023(6);
        Node_2511533023 node7 = new Node_2511533023(7);
        Node_2511533023 node8 = new Node_2511533023(8);
        Node_2511533023 node9 = new Node_2511533023(9);
        root.setLeft_3023(node2);
        node2.setLeft_3023(node4);
        node2.setRight_3023(node5);
        node4.setRight_3023(node8);
        root.setRight_3023(node3);
        node3.setLeft_3023(node6);
        node3.setRight_3023(node7);
        node6.setLeft_3023(node9);
        tree.setCurrent(tree.getRoot_3023());
        System.out.println("menampilkan simpul terakhir: ");
        System.out.println(tree.getCurrent().getData_3023());
        System.out.println("Jumlah simpul; setelah simpul 7 ditambahkan");
        System.out.println(tree.countNodes_3023());
        System.out.println("inOrder: ");
        tree.printInorder_3023();
        System.out.println("\nPreorder: ");
        tree.printPreOrder_3023();
        System.out.println("\\nPostorder: ");
        tree.printPostOrder_3023();
        System.out.println("\nDmenampilkan simpul dalam bentuk pohon");
        tree.print_3023();
    }
}
