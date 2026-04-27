package Pekan4_2511533023;

public class QueueArrayDriver_2511533023 {
    public static void main(String[] args) {
        QueueArray_2511533023 queue = new QueueArray_2511533023(1000);

        queue.enqueue_3023(10);
        queue.enqueue_3023(20);
        queue.enqueue_3023(30);
        queue.enqueue_3023(40);

        System.out.println("Item di depan " + queue.front_3023());
        System.out.println("item paling belakang " + queue.rear_3023());
        
        System.out.println("tampilan queue");
        queue.display_3023();
        System.out.println();

        System.out.println(queue.dequeue_3023() + " dihapus dari queue");
        System.out.println("item di depan:" + queue.front_3023());
        System.out.println("item dibelakang: " + queue.rear_3023());

        System.out.println("tampilan queue setelah satu data dihapus");
        queue.display_3023();
    }
}
