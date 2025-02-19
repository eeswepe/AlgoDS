public class MataKuliahMain26 {
  public static void main(String[] args) {
    MataKuliah26 daspro = new MataKuliah26();
    daspro.kodeMK = "DASPRO";
    daspro.nama = "Dasar Pemrogaman";
    daspro.sks = 3;
    daspro.jumlahJam = 30;
    daspro.tampilInformasi();
    daspro.kurangiJam(20);
    daspro.ubahSKS(4);
    daspro.tampilInformasi();

    MataKuliah26 KTI = new MataKuliah26("KTI", "Konsep Teknologi Informasi", 4, 2);
    KTI.tampilInformasi();
    KTI.tambahJam(4);
    KTI.tampilInformasi();
  }
}
