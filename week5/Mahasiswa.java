public class Mahasiswa {
  String nama;
  String nim;
  int tahunMasuk;
  int nilaiUTS;
  int nilaiUAS;

  public Mahasiswa(String nama, String nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
    this.nama = nama;
    this.nim = nim;
    this.tahunMasuk = tahunMasuk;
    this.nilaiUTS = nilaiUTS;
    this.nilaiUAS = nilaiUAS;
  }

  public static Mahasiswa nilaiUTSTertinggi(Mahasiswa[] arrayOfMhs, int awal, int akhir) {
    if (awal == akhir) {
      return arrayOfMhs[awal];
    } else {
      int mid = (awal + akhir) / 2;
      Mahasiswa mhs1 = nilaiUTSTertinggi(arrayOfMhs, awal, mid);
      Mahasiswa mhs2 = nilaiUTSTertinggi(arrayOfMhs, mid + 1, akhir);
      if (mhs1.nilaiUTS > mhs2.nilaiUTS) {
        return mhs1;
      } else {
        return mhs2;
      }
    }
  }

  public static Mahasiswa nilaiUTSTerendah(Mahasiswa[] arrayOfMhs, int awal, int akhir) {
    if (awal == akhir) {
      return arrayOfMhs[awal];
    } else {
      int mid = (awal + akhir) / 2;
      Mahasiswa mhs1 = nilaiUTSTerendah(arrayOfMhs, awal, mid);
      Mahasiswa mhs2 = nilaiUTSTerendah(arrayOfMhs, mid + 1, akhir);
      if (mhs1.nilaiUTS < mhs2.nilaiUTS) {
        return mhs1;
      } else {
        return mhs2;
      }
    }
  }

  public static double rataNilaiUAS(Mahasiswa[] arrayOfMhs) {
    double rataan = 0;
    for (int i = 0; i < arrayOfMhs.length; i++) {
      rataan += arrayOfMhs[i].nilaiUAS;
    }
    return rataan / arrayOfMhs.length;
  }
}
