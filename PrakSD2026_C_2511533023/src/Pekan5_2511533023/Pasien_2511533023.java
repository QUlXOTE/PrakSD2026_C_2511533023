package Pekan5_2511533023;

public class Pasien_2511533023 {
    private String namaPasien_3023;
    private String penyakit_3023;
    private int nomorAntrian_3023;
    private Pasien_2511533023 next_3023;

    public Pasien_2511533023(String nama_3023, String keluhan_3023, int noAntrian_3023) {
        this.namaPasien_3023 = nama_3023;
        this.penyakit_3023 = keluhan_3023;
        this.nomorAntrian_3023 = noAntrian_3023;
        this.next_3023 = null;
    }

    // Getter
    public String getNamaPasien_3023() { return namaPasien_3023; }
    public String getPenyakit_3023() { return penyakit_3023; }
    public int getNomorAntrian_3023() { return nomorAntrian_3023; }
    public Pasien_2511533023 getNext_3023() { return next_3023; }

    // Setter
    public void setNext_3023(Pasien_2511533023 next_3023) { this.next_3023 = next_3023; }
}