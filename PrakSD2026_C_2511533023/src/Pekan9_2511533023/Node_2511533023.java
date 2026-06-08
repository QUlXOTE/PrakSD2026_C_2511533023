package Pekan9_2511533023;

public class Node_2511533023 {
    int data_3023;
    Node_2511533023 left_3023;
    Node_2511533023 right_3023;

    public Node_2511533023(int data_3023) {
        this.data_3023 = data_3023;
        left_3023 = null;
        right_3023 = null;
    }

    public void setLeft_3023(Node_2511533023 node_3023) {
        if (left_3023 == null) {
            left_3023 = node_3023;
        }
    }

    public void setRight_3023(Node_2511533023 node_3023) {
        if (right_3023 == null) {
            right_3023 = node_3023;
        }
    }

    public Node_2511533023 getLeft_3023() {
        return left_3023;
    }

    public Node_2511533023 getRight_3023() {
        return right_3023;
    }

    public int getData_3023() {
        return data_3023;
    }

    public void setData_3023(int data_3023) {
        this.data_3023 = data_3023;
    }

    void printPreorder_3023(Node_2511533023 node_3023) {
        if (node_3023 == null) {
            return;
        }
        System.out.print(node_3023.data_3023 + " ");
        printPreorder_3023(node_3023.left_3023);
        printPreorder_3023(node_3023.right_3023);
    }

    void printPostorder_3023(Node_2511533023 node_3023) {
        if (node_3023 == null) {
            return;
        }
        printPostorder_3023(node_3023.left_3023);
        printPostorder_3023(node_3023.right_3023);
        System.out.print(node_3023.data_3023 + " ");
    }

    void printInorder_3023(Node_2511533023 node_3023) {
        if (node_3023 == null) {
            return;
        }
        printInorder_3023(node_3023.left_3023);
        System.out.print(node_3023.data_3023 + " ");
        printInorder_3023(node_3023.right_3023);
    }

    public String print_3023() {
        return this.print_3023("", true, "");
    }

    public String print_3023(String prefix_3023, boolean isTail_3023, String sb_3023) {
        if (right_3023 != null) {
            right_3023.print_3023(prefix_3023 + (isTail_3023 ? "|   " : "    "), false, sb_3023);
        }
        
        System.out.println(prefix_3023 + (isTail_3023 ? "\\-- " : "/-- ") + data_3023);
        
        if (left_3023 != null) {
            left_3023.print_3023(prefix_3023 + (isTail_3023 ? "    " : "|   "), true, sb_3023);
        }
        
        return sb_3023;
    }
}