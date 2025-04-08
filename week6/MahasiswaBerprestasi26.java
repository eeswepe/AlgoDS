public class MahasiswaBerprestasi26 {
  Mahasiswa26[] listMhs = new Mahasiswa26[5];
  int idx;

  public void tambah(Mahasiswa26 m) {
    if (idx < listMhs.length) {
      listMhs[idx] = m;
      idx++;
    } else {
      System.out.println("Data sudah penuh");
    }
  }

  public void tampil() {
    for (Mahasiswa26 m : listMhs) {
      m.tampilInformasi();
      System.out.println("-----------------");
    }
  }

  public void bubbleSort() {
    for (int i = 0; i < listMhs.length - 1; i++) {
      for (int j = 1; j < listMhs.length - i; j++) {
        if (listMhs[j].ipk > listMhs[j - 1].ipk) {
          Mahasiswa26 temp = listMhs[j];
          listMhs[j] = listMhs[j - 1];
          listMhs[j - 1] = temp;
        }
      }
    }
  }

  public void selectionSort() {
    for (int i = 0; i < listMhs.length - 1; i++) {
      int idxMin = i;
      for (int j = i + 1; j < listMhs.length; j++) {
        if (listMhs[j].ipk < listMhs[idxMin].ipk) {
          idxMin = j;
        }
      }
      Mahasiswa26 temp = listMhs[i];
      listMhs[i] = listMhs[idxMin];
      listMhs[idxMin] = temp;
    }
  }

  public void insertionSort() {
    for (int i = 1; i < listMhs.length; i++) {
      Mahasiswa26 temp = listMhs[i];
      int j = i;
      while (j > 0 && listMhs[j - 1].ipk > temp.ipk) {
        listMhs[j] = listMhs[j - 1];
        j--;
      }
      listMhs[j] = temp;
    }
  }
}
