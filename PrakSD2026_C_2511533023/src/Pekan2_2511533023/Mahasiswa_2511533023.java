package Pekan2_2511533023;

public class Mahasiswa_2511533023 {
	String nim;
	String nama;
	String prodi;
	Mahasiswa_2511533023(String nim, String nama, String prodi){
		this.nim = nim;
		this.nama = nama;
		this.prodi = prodi;
	}
	
	public String toString() {
		return "NIM: " + nim + ", NAMA:  " + nama + ", PRODI: " + prodi ;
	}

}
