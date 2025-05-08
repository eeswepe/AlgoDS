public class DataDosen26 {
  public Dosen26 dataDosen[] = new Dosen26[10];
  int idx = 0;

  public void tambah(Dosen26 d) {
    if (idx < dataDosen.length) {
      dataDosen[idx] = d;
      idx++;
    } else {
      System.out.println("Data sudah penuh");
    }
  }

  public void tampil() {
    for (Dosen26 d : dataDosen) {
      d.tampil();
    }
    System.out.println("-----------------");
  }

  public void sortingASC() {
    for (int i = 0; i < idx - 1; i++) {
      for (int j = 0; j < idx - i - 1; j++) {
        if (dataDosen[j].umur > dataDosen[j + 1].umur) {
          Dosen26 temp = dataDosen[j];
          dataDosen[j] = dataDosen[j + 1];
          dataDosen[j + 1] = temp;
        }
      }
    }
  }

  public void sortingDESC() {
    for (int i = 0; i < idx - 1; i++) {
      int idxMin = i;
      for (int j = i + 1; j < idx; j++) {
        if (dataDosen[j].umur > dataDosen[idxMin].umur) {
          idxMin = j;
        }
      }
      Dosen26 temp = dataDosen[i];
      dataDosen[i] = dataDosen[idxMin];
      dataDosen[idxMin] = temp;
    }
  }

  public void insertionSort() {
    for (int i = 1; i < idx; i++) {
      Dosen26 temp = dataDosen[i];
      int j = i;
      while (j > 0 && dataDosen[j - 1].umur > temp.umur) {
        dataDosen[j] = dataDosen[j - 1];
        j--;
      }
      dataDosen[j] = temp;
    }
  }
}
