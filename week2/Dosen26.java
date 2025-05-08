public class Dosen26 {
  String idDosen;
  String nama;
  boolean statusAktif;
  int tahunBergabung;
  String bidangKeahlian;

  public Dosen26() {}

  public Dosen26(
      String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
    this.idDosen = idDosen;
    this.nama = nama;
    this.statusAktif = statusAktif;
    this.tahunBergabung = tahunBergabung;
    this.bidangKeahlian = bidangKeahlian;
  }

  public void tampilInformasi() {
    System.out.println("ID Dosen: " + idDosen);
    System.out.println("Nama Dosen: " + nama);
    System.out.println("Status Aktif: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
    System.out.println("Tahun Bergabung: " + tahunBergabung);
    System.out.println("Bidang Keahlian: " + bidangKeahlian);
  }

  public void setStatusAktif(boolean statusAktif) {
    this.statusAktif = statusAktif;
    System.out.println(
        "Status keaktifan "
            + this.nama
            + " berubah menjadi "
            + (statusAktif ? "Aktif" : "Tidak Aktif"));
  }

  public int hitungMasaKerja(int thnSkrg) {
    return thnSkrg - tahunBergabung;
  }

  public void ubahKeahlian(String bidang) {
    this.bidangKeahlian = bidang;
    System.out.println("Bidang keahlian " + this.nama + " berubah menjadi " + this.bidangKeahlian);
  }
}
