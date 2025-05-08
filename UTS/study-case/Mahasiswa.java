public class Mahasiswa {
  String nim;
  String namaMahasiswa;
  int alpha = 0;

  public Mahasiswa(String nim, String namaMahasiswa) {
    this.nim = nim;
    this.namaMahasiswa = namaMahasiswa;
  }

  public void tampilData() {
    System.out.println("NIM : " + nim + " | Nama : " + namaMahasiswa);
  }
}
