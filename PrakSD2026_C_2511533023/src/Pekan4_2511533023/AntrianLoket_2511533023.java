package Pekan4_2511533023;

public class AntrianLoket_2511533023 {
    // Variabel wajib sesuai standar tugas dengan tambahan _3023 
    private int front_3023; // indeks depan 
    private int rear_3023;  // indeks belakang 
    private int max_3023;   // kapasitas array 
    private String[] queue_3023; // array penyimpan data 

    // Inisialisasi awal dan deklarasi kapasitas 
    public AntrianLoket_2511533023(int kapasitas) {
        this.max_3023 = kapasitas;
        this.queue_3023 = new String[max_3023];
        this.front_3023 = -1; // penanda antrean kosong 
        this.rear_3023 = -1;  // penanda antrean kosong 
    }

    // Method untuk mengecek apakah antrean kosong 
    public boolean isEmpty_3023() {
        return (front_3023 == -1); // mengembalikan true jika kosong 
    }

    // Method untuk mengecek apakah antrean penuh 
    public boolean isFull_3023() {
        return (rear_3023 == max_3023 - 1); // mengembalikan true jika penuh 
    }

    // Method untuk menambah data ke belakang antrian 
    public void enqueue_3023(String nama) {
        if (isFull_3023()) {
            System.out.println("Antrean penuh! Tidak dapat menambah pelanggan."); // pesan jika penuh 
        } else {
            if (isEmpty_3023()) {
                front_3023 = 0;
            }
            rear_3023++;
            queue_3023[rear_3023] = nama;
            System.out.println("Data berhasil ditambahkan ke antrian"); // pesan sukses 
        }
    }

    // Method untuk menghapus data dari depan antrian 
    public String dequeue_3023() {
        if (isEmpty_3023()) {
            System.out.println("Antrean kosong!"); // pesan jika kosong 
            return null;
        } else {
            String nama = queue_3023[front_3023];
            // Menggeser data untuk mempertahankan prinsip antrean array linear
            for (int i = 0; i < rear_3023; i++) {
                queue_3023[i] = queue_3023[i + 1];
            }
            if (front_3023 == rear_3023) {
                front_3023 = -1;
                rear_3023 = -1;
            } else {
                rear_3023--;
            }
            return nama;
        }
    }

    // Method untuk menampilkan seluruh isi antrian 
    public void display_3023() {
        if (isEmpty_3023()) {
            System.out.println("Antrean Kosong");
        } else {
            System.out.println("Isi antrian:"); // header isi antrean 
            for (int i = 0; i <= rear_3023; i++) {
                System.out.println((i + 1) + ". " + queue_3023[i]); // format list antrean 
            }
        }
    }

    // Method untuk membalik seluruh isi antrian 
    public void Reverse_3023() {
        if (isEmpty_3023()) return;
        java.util.Stack<String> s = new java.util.Stack<>();
        while (!isEmpty_3023()) {
            s.push(dequeue_3023());
        }
        while (!s.isEmpty()) {
            enqueue_3023(s.pop());
        }
    }
}
