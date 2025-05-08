public class DataMahasiswa {
  Mahasiswa arrayOfMahasiswa[] = new Mahasiswa[5];

  public DataMahasiswa(Mahasiswa[] arrayOfMahasiswa) {
    this.arrayOfMahasiswa = arrayOfMahasiswa;
  }

  public void tampilMahasiswa() {
    System.out.println("=== DATA MAHASISWA ===");
    for (int i = 0; i < arrayOfMahasiswa.length; i++) {
      arrayOfMahasiswa[i].tampilData();
    }
  }

  public void tampilAlphaTerbanyak() {
    int maks = arrayOfMahasiswa[0].alpha;
    int idx_maks = 0;
    for (int i = 1; i < arrayOfMahasiswa.length; i++) {
      if (arrayOfMahasiswa[i].alpha > maks) {
        maks = arrayOfMahasiswa[i].alpha;
        idx_maks = i;
      }
    }
    System.out.println("Mahasiswa Dengan Alpha Terbanyak Adalah");
    System.out.println(
        arrayOfMahasiswa[idx_maks].namaMahasiswa
            + " Dengan total "
            + arrayOfMahasiswa[idx_maks].alpha
            + " Alpha");
  }
}
