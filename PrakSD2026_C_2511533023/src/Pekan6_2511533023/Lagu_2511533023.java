package Pekan6_2511533023;

//Kelas Lagu sesuai NIM lengkap 
class Lagu_2511533023 {
 private String judul_3023; // Atribut dengan akhiran NIM 
 private String penyanyi_3023; // [cite: 18]
 Lagu_2511533023 next_3023; // Pointer ke lagu berikutnya 
 Lagu_2511533023 prev_3023; // Pointer ke lagu sebelumnya 

 // Constructor [cite: 22]
 public Lagu_2511533023(String judul_3023, String penyanyi_3023) {
     this.judul_3023 = judul_3023;
     this.penyanyi_3023 = penyanyi_3023;
     this.next_3023 = null;
     this.prev_3023 = null;
 }

 // Getter dan Setter 
 public String getJudul_3023() { return judul_3023; }
 public void setJudul_3023(String judul_3023) { this.judul_3023 = judul_3023; }

 public String getPenyanyi_3023() { return penyanyi_3023; }
 public void setPenyanyi_3023(String penyanyi_3023) { this.penyanyi_3023 = penyanyi_3023; }
}
