public class MataKuliah26 {
  String kodeMK;
  String nama;
  int sks;
  int jumlahJam;

  public MataKuliah26() {}

  public MataKuliah26(String kodeMK, String nama, int sks, int jumlahJam) {
    this.kodeMK = kodeMK;
    this.nama = nama;
    this.sks = sks;
    this.jumlahJam = jumlahJam;
  }

  public void tampilInformasi() {
    System.out.println("Kode Mata Kuliah: " + kodeMK);
    System.out.println("Nama Mata Kuliah: " + nama);
    System.out.println("SKS: " + sks);
    System.out.println("Jumlah Jam: " + jumlahJam);
  }

  public void ubahSKS(int sks) {
    this.sks = sks;
  }

  public void tambahJam(int jam) {
    this.jumlahJam += jam;
    System.out.println(
        "Berhasil Menambahkan " + jam + " jam, total jam sekarang " + this.jumlahJam);
  }

  public void kurangiJam(int jam) {
    if (this.jumlahJam < jam) {
      System.out.println(
          "Gagal mengurangi jam, jumlah jam pengurang lebih besar dari pada jumlah jam saat ini.");
      return;
    }
    this.jumlahJam -= jam;
    System.out.println("Jumlah jam berkurang " + jam + " jam menjadi " + (this.jumlahJam));
    return;
  }
}
