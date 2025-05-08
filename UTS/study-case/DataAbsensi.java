public class DataAbsensi {

  Absensi arrayOfAbsensi[] = new Absensi[7];

  public DataAbsensi(Absensi arrayOfAbsensi[]) {
    this.arrayOfAbsensi = arrayOfAbsensi;
  }

  public void tampilAbsensi() {
    System.out.println("=== DATA ABSENSI ===");
    for (int i = 0; i < 7; i++) {
      arrayOfAbsensi[i].tampilData();
    }
  }

  public void sortAbsensi() {
    // menggunakan algoritma bubble sort
    Absensi temp;
    for (int i = 0; i < arrayOfAbsensi.length; i++) {
      for (int j = 1; j < (arrayOfAbsensi.length - i); j++) {
        if (arrayOfAbsensi[j - 1].hitungPersentaseKehadiran()
            < arrayOfAbsensi[j].hitungPersentaseKehadiran()) {
          temp = arrayOfAbsensi[j];
          arrayOfAbsensi[j] = arrayOfAbsensi[j - 1];
          arrayOfAbsensi[j - 1] = temp;
        }
      }
    }
  }

  void sequntialSearching(String cari) {
    boolean found = false;
    for (int i = 0; i < arrayOfAbsensi.length; i++) {
      if (arrayOfAbsensi[i].mahasiswa.nim.equalsIgnoreCase(cari)) {
        arrayOfAbsensi[i].tampilData();
        found = true;
      }
    }
    if (found == false) {
      System.out.println("Data absensi untuk NIM \"" + cari + "\" tidak ditemukan.");
    }
  }

  void jumlahAlpha() {
    for (int i = 0; i < arrayOfAbsensi.length; i++) {
      arrayOfAbsensi[i].mahasiswa.alpha += arrayOfAbsensi[i].alpa;
    }
  }
}
