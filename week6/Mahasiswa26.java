public class Mahasiswa26 {
  String nama;
  String nim;
  String kelas;
  double ipk;

  public Mahasiswa26() {}

  public Mahasiswa26(String nim, String nama, String kelas, double ipk) {
    this.nim = nim;
    this.nama = nama;
    this.kelas = kelas;
    this.ipk = ipk;
  }

  public void tampilInformasi() {
    System.out.println("Nama: " + this.nama);
    System.out.println("NIM: " + this.nim);
    System.out.println("Kelas: " + this.kelas);
    System.out.println("IPK: " + this.ipk);
  }
}
