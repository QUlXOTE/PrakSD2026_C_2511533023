package Pekan4_2511533023;

public class QueueArray_2511533023 {
    int front, rear, size;
    int capacity;
    int array[];

    public QueueArray_2511533023(int capacity) {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }

    boolean isFull_3023(QueueArray_2511533023 queue) {
        return (queue.size == queue.capacity);
    }

    boolean isEmpty_3023(QueueArray_2511533023 queue) {
        return (queue.size == 0);
    }

    void enqueue_3023(int item) {
        if (isFull_3023(this)) {
            System.out.println("Queue is full");
            return;
        }
        this.rear = (this.rear + 1) % this.capacity;
        this.array[this.rear] = item;
        this.size = this.size + 1;
        System.out.println(item + " enqueued to queue");
    }
    int dequeue_3023() {
        if (isEmpty_3023(this)) {
            return Integer.MIN_VALUE;
        }
        int item = this.array[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size = this.size - 1;
        return item;
    }

    int front_3023() {
        if (isEmpty_3023(this)) {
            return Integer.MIN_VALUE;
        }
        return this.array[this.front];
    }

    int rear_3023() {
        if (isEmpty_3023(this)) {
            return Integer.MIN_VALUE;
        }
        return this.array[this.rear];
    }

    // mencetak elemen antrian
    void display_3023() {
        int i;
        if (front == rear) {
            System.out.printf("\nAntrian Kosong\n");
            return;
        }
        // kunjungi dari belakang dan cetak
        for (i = front; i < rear; i++) {
            System.out.printf(" %d <-- ", array[i]);
        }
        return;
    }
}
