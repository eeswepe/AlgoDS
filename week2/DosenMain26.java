public class DosenMain26 {
  public static void main(String[] args) {
    Dosen26 dosen1 = new Dosen26();
    dosen1.idDosen = "Dosen1";
    dosen1.nama = "Budi";
    dosen1.statusAktif = true;
    dosen1.tahunBergabung = 2015;
    dosen1.bidangKeahlian = "Pemrograman";

    dosen1.tampilInformasi();
    dosen1.ubahKeahlian("Basis Data");
    dosen1.tampilInformasi();
    System.out.println(dosen1.hitungMasaKerja(2025));

    Dosen26 dosen2 = new Dosen26("Dosen2", "Joko", true, 2016, "Pemrograman");
    dosen2.tampilInformasi();
    dosen2.setStatusAktif(false);
    dosen2.tampilInformasi();
    System.out.println(dosen2.hitungMasaKerja(2025));
  }
}
