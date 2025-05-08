public class Dosen26 {
  String kode;
  String nama;
  Boolean jenisKelamin;
  int usia;

  public Dosen26(String kode, String nama, Boolean jenisKelamin, int usia) {
    this.kode = kode;
    this.nama = nama;
    this.jenisKelamin = jenisKelamin;
    this.usia = usia;
  }

  public void printData() {
    System.out.println("Kode          : " + this.kode);
    System.out.println("Nama          : " + this.nama);
    System.out.println("Jenis Kelamin : " + (this.jenisKelamin ? "Laki-laki" : "Perempuan"));
    System.out.println("Usia          : " + this.usia);
    System.out.println("---------------------------------");
  }
}
