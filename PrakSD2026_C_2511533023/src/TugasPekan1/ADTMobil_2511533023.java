package TugasPekan1;

import java.util.ArrayList;

public class ADTMobil_2511533023 {
    // atribut sesuai soal
    private String nama;
    private int tahun;
    private int cc;
    private double harga;
    private String merk;

    // list penyimpanan
    private ArrayList<ADTMobil_2511533023> daftarMobil = new ArrayList<>();

    // constructor
    public ADTMobil_2511533023() {}

    public ADTMobil_2511533023(String nama, int tahun, int cc, double harga, String merk) {
        this.nama = nama;
        this.tahun = tahun;
        this.cc = cc;
        this.harga = harga;
        this.merk = merk;
    }

    // method tambah mobil
    public void tambahMobil(ADTMobil_2511533023 mobil) {
        daftarMobil.add(mobil);
    }

    // method hapus mobil
    public void hapusMobil(int index) {
        if (index >= 0 && index < daftarMobil.size()) {
            daftarMobil.remove(index);
        }
    }

    // selector (getter)
    public String getNama() { return nama; }
    public int getTahun() { return tahun; }
    public int getCc() { return cc; }
    public double getHarga() { return harga; }
    public String getMerk() { return merk; }

    // mutator (setter)
    public void setNama(String nama) { this.nama = nama; }
    public void setTahun(int tahun) { this.tahun = tahun; }
    public void setCc(int cc) { this.cc = cc; }
    public void setHarga(double harga) { this.harga = harga; }
    public void setMerk(String merk) { this.merk = merk; }

    // tampilkan data
    public void tampilkanMobil() {
        for (ADTMobil_2511533023 m : daftarMobil) {
            System.out.println(m.nama + ", " + m.tahun + ", " + m.cc + ", " + m.harga + ", " + m.merk);
        }
    }
}
