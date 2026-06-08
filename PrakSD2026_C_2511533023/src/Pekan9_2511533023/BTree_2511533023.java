package Pekan9_2511533023;

public class BTree_2511533023 {
    private Node_2511533023 root_3023;
    private Node_2511533023 currentNode_3023;

    public BTree_2511533023() {
        root_3023 = null;
    }

    public boolean search_3023(int data_3023) {
        return search_3023(root_3023, data_3023);
    }

    private boolean search_3023(Node_2511533023 node_3023, int data_3023) {
        if (node_3023.getData_3023() == data_3023) {
            return true;
        }
        if (node_3023.getLeft_3023() != null) {
            if (search_3023(node_3023.getLeft_3023(), data_3023)) {
                return true;
            }
        }
        if (node_3023.getRight_3023() != null) {
            if (search_3023(node_3023.getRight_3023(), data_3023)) {
                return true;
            }
        }
        return false;
    }

    public void printInorder_3023() {
        root_3023.printInorder_3023(root_3023);
    }

    public void printPreOrder_3023() {
        root_3023.printPreorder_3023(root_3023);
    }

    public void printPostOrder_3023() {
        root_3023.printPostorder_3023(root_3023);
    }

    public Node_2511533023 getRoot_3023() {
        return root_3023;
    }
    public boolean isEmpty_3023() {
    	return root_3023 == null;
    }
    public int countNodes_3023() {
    	return countNodes_3023(root_3023);
    	
    }
    private int countNodes_3023(Node_2511533023 node_3023) {
    	int count_3023 = 1;
    	if(node_3023 == null) {
    		return 0;
    	}else {
    		count_3023 += countNodes_3023(node_3023.getLeft_3023());
    		count_3023 += countNodes_3023(node_3023.getRight_3023());
    		return count_3023;
    	}
    }
    public void print_3023() {
    	root_3023.print_3023();
    }
    public Node_2511533023 getCurrent() {
    	return currentNode_3023;
    }
    public void setCurrent(Node_2511533023 node_3023) {
    	this.currentNode_3023 = node_3023;
    }
    public void setRoot(Node_2511533023 root, Node_2511533023 root_3023) {
    	this.root_3023 = root_3023;
    }
}

