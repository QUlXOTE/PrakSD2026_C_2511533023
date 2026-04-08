package Pekan3_2511533023;

public class StackArray_2511533023 {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX];

    boolean isEmpty_3023() {
        return (top < 0);
    }

    StackArray_2511533023() {
        top = -1;
    }

    boolean push_3023(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " dimasukkan dalam stack");
            return true;
        }
    }

    int pop_3023() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }

    int peek_3023() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top];
            return x;
        }
    }

    void print_3023() {
        for (int i = top; i > -1; i--) {
            System.out.print(" " + a[i]);
        }
    }
}
