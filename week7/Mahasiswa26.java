public class Mahasiswa26 {
  String nim;
  String nama;
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
    System.out.println("------------------");
    System.out.println("NIM : " + nim);
    System.out.println("Nama : " + nama);
    System.out.println("Kelas : " + kelas);
    System.out.println("IPK : " + ipk);
  }
}
