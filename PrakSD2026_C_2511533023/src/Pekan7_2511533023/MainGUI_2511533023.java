package Pekan7_2511533023;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainGUI_2511533023 extends JFrame {
    // Menyimpan basis data dinamis mahasiswa aktif 
    private ArrayList<Mahasiswa_2511533023> listMahasiswa_3023 = new ArrayList<>();

    // Komponen GUI 
    private JTextField txtNama_3023, txtNim_3023, txtProdi_3023; 
    private JButton btnTambah_3023, btnHapus_3023, btnSort_3023; 
    private JComboBox<String> cmbAlgoritma_3023; 
    private JTable table_3023; 
    private DefaultTableModel tableModel_3023;
    private JTextArea txtAreaLog_3023; 

    public MainGUI_2511533023() {
        // Setup Window GUI Utama 
        setTitle("Praktikum Struktur Data Pekan 7 - NIM: 2511533023");
        setSize(850, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // --- PANEL INPUT DATA (UTARA) ---
        JPanel panelInput_3023 = new JPanel(new GridLayout(4, 2, 5, 5));
        panelInput_3023.setBorder(BorderFactory.createTitledBorder("Form Input Mahasiswa")); 

        panelInput_3023.add(new JLabel(" Nama Mahasiswa:"));
        txtNama_3023 = new JTextField();
        panelInput_3023.add(txtNama_3023);

        panelInput_3023.add(new JLabel(" NIM Mahasiswa:"));
        txtNim_3023 = new JTextField(); 
        panelInput_3023.add(txtNim_3023);

        panelInput_3023.add(new JLabel(" Program Studi:"));
        txtProdi_3023 = new JTextField(); 
        panelInput_3023.add(txtProdi_3023);

        btnTambah_3023 = new JButton("Tambah Data"); 
        btnHapus_3023 = new JButton("Hapus Data Terpilih"); 
        panelInput_3023.add(btnTambah_3023);
        panelInput_3023.add(btnHapus_3023);

        // --- PANEL TENGAH (TABEL DATA & COMBOBOX) ---
        JPanel panelTengah_3023 = new JPanel(new BorderLayout(5, 5));
        
        String[] kolom_3023 = {"Nama", "NIM", "Program Studi"};
        tableModel_3023 = new DefaultTableModel(kolom_3023, 0);
        table_3023 = new JTable(tableModel_3023); 
        JScrollPane scrollTabel_3023 = new JScrollPane(table_3023);
        scrollTabel_3023.setPreferredSize(new Dimension(400, 200));
        panelTengah_3023.add(scrollTabel_3023, BorderLayout.CENTER);

        // Bagian Dropdown Pilihan Algoritma 
        JPanel panelKontrol_3023 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelKontrol_3023.setBorder(BorderFactory.createTitledBorder("Metode Pengurutan"));
        
        String[] opsiAlgoritma_3023 = {"Insertion Sort", "Selection Sort", "Bubble Sort"}; 
        cmbAlgoritma_3023 = new JComboBox<>(opsiAlgoritma_3023);
        btnSort_3023 = new JButton("Mulai Sorting"); 
        
        panelKontrol_3023.add(new JLabel("Pilih Algoritma: "));
        panelKontrol_3023.add(cmbAlgoritma_3023);
        panelKontrol_3023.add(btnSort_3023);
        panelTengah_3023.add(panelKontrol_3023, BorderLayout.SOUTH);

        // --- PANEL SELATAN (VISUALISASI LOG PROSES) ---
        JPanel panelLog_3023 = new JPanel(new BorderLayout());
        panelLog_3023.setBorder(BorderFactory.createTitledBorder("Visualisasi Langkah Demi Langkah"));
        txtAreaLog_3023 = new JTextArea(12, 50); 
        txtAreaLog_3023.setEditable(false);
        txtAreaLog_3023.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollLog_3023 = new JScrollPane(txtAreaLog_3023);
        panelLog_3023.add(scrollLog_3023, BorderLayout.CENTER);

        // Pasang seluruh komponen ke Frame Utama
        add(panelInput_3023, BorderLayout.NORTH);
        add(panelTengah_3023, BorderLayout.CENTER);
        add(panelLog_3023, BorderLayout.SOUTH);

        // --- ACTION LISTENERS ---

        // Fungsi Tambah Data Ke Tabel 
        btnTambah_3023.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = txtNama_3023.getText().trim();
                String nim = txtNim_3023.getText().trim();
                String prodi = txtProdi_3023.getText().trim();

                if (!nama.isEmpty() && !nim.isEmpty() && !prodi.isEmpty()) {
                    Mahasiswa_2511533023 mhs_3023 = new Mahasiswa_2511533023(nama, nim, prodi);
                    listMahasiswa_3023.add(mhs_3023);
                    
                    tableModel_3023.addRow(new Object[]{mhs_3023.getNama_3023(), mhs_3023.getNim_3023(), mhs_3023.getProdi_3023()});
                    
                    txtNama_3023.setText("");
                    txtNim_3023.setText("");
                    txtProdi_3023.setText("");
                } else {
                    JOptionPane.showMessageDialog(MainGUI_2511533023.this, "Semua data input wajib diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        // Fungsi Hapus Baris Terpilih
        btnHapus_3023.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int barisTerpilih_3023 = table_3023.getSelectedRow();
                if (barisTerpilih_3023 != -1) {
                    listMahasiswa_3023.remove(barisTerpilih_3023);
                    tableModel_3023.removeRow(barisTerpilih_3023);
                } else {
                    JOptionPane.showMessageDialog(MainGUI_2511533023.this, "Pilih baris di tabel terlebih dahulu.", "Info", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        // Fungsi Memulai Eksekusi Algoritma Pengurutan [cite: 61, 62]
        btnSort_3023.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (listMahasiswa_3023.size() < 2) {
                    JOptionPane.showMessageDialog(MainGUI_2511533023.this, "Isi minimal 2 data mahasiswa untuk diurutkan.", "Info", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                // Data awal yang digunakan identik untuk ketiga algoritma [cite: 81]
                Mahasiswa_2511533023[] arraySort_3023 = listMahasiswa_3023.toArray(new Mahasiswa_2511533023[0]);
                String pilihanAlgoritma_3023 = (String) cmbAlgoritma_3023.getSelectedItem(); // [cite: 60]
                ArrayList<String> hasilLog_3023 = new ArrayList<>();

                if (pilihanAlgoritma_3023.equals("Insertion Sort")) {
                    hasilLog_3023 = SortingEngine_2511533023.insertionSort(arraySort_3023);
                } else if (pilihanAlgoritma_3023.equals("Selection Sort")) {
                    hasilLog_3023 = SortingEngine_2511533023.selectionSort(arraySort_3023);
                } else if (pilihanAlgoritma_3023.equals("Bubble Sort")) {
                    hasilLog_3023 = SortingEngine_2511533023.bubbleSort(arraySort_3023);
                }

                // Bersihkan log lama, cetak serentak ke GUI JTextArea dan Console [cite: 63, 80]
                txtAreaLog_3023.setText("");
                for (String logLine_3023 : hasilLog_3023) {
                    txtAreaLog_3023.append(logLine_3023 + "\n"); // Tampil di GUI [cite: 63]
                    System.out.println(logLine_3023);            // Tampil di Console [cite: 80]
                }

                // Render ulang tabel utama sesuai hasil akhir urutan (A-Z Ascending) [cite: 11, 64]
                listMahasiswa_3023.clear();
                tableModel_3023.setRowCount(0);
                for (Mahasiswa_2511533023 mhs_3023 : arraySort_3023) {
                    listMahasiswa_3023.add(mhs_3023);
                    tableModel_3023.addRow(new Object[]{mhs_3023.getNama_3023(), mhs_3023.getNim_3023(), mhs_3023.getProdi_3023()});
                }
            }
        });
    }

    // Main Run Method
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainGUI_2511533023().setVisible(true);
            }
        });
    }
}
