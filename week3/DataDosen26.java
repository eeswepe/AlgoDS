public class DataDosen26 {
  public void dataSemuaDosen(Dosen26[] arrayOfDosen26) {
    for (Dosen26 dosen : arrayOfDosen26) {
      dosen.printData();
    }
  }

  public void jumlahDosenPerJenisKelamin(Dosen26[] arrayOfDosen26) {
    int jumlahLakiLaki = 0;
    int jumlahPerempuan = 0;
    for (Dosen26 dosen : arrayOfDosen26) {
      if (dosen.jenisKelamin) {
        jumlahLakiLaki++;
      } else {
        jumlahPerempuan++;
      }
    }
    System.out.println("===Data Dosen Per Jenis Kelamin===");
    System.out.println("Jumlah Dosen Laki-laki : " + jumlahLakiLaki);
    System.out.println("Jumlah Dosen Perempuan : " + jumlahPerempuan);
  }

  public void rerataUsiaDosenPerJenisKelamin(Dosen26[] arrayOfDosen26) {
    int jumlahLakiLaki = 0;
    int jumlahPerempuan = 0;
    int totalUsiaLakiLaki = 0;
    int totalUsiaPerempuan = 0;
    for (Dosen26 dosen : arrayOfDosen26) {
      if (dosen.jenisKelamin) {
        jumlahLakiLaki++;
        totalUsiaLakiLaki += dosen.usia;
      } else {
        jumlahPerempuan++;
        totalUsiaPerempuan += dosen.usia;
      }
    }
    System.out.println("===Rerata Usia Dosen Per Jenis Kelamin===");
    System.out.println("Rerata Usia Dosen Laki-laki : " + totalUsiaLakiLaki / jumlahLakiLaki);
    System.out.println("Rerata Usia Dosen Perempuan : " + totalUsiaPerempuan / jumlahPerempuan);
  }

  public void infoDosenPalingTua(Dosen26[] arrayOfDosen26) {
    int usiaTerbesar = 0;
    int indexUsiaTerbesar = 0;
    for (int i = 0; i < arrayOfDosen26.length; i++) {
      if (arrayOfDosen26[i].usia > usiaTerbesar) {
        usiaTerbesar = arrayOfDosen26[i].usia;
        indexUsiaTerbesar = i;
      }
    }
    System.out.println("===Data Dosen Paling Tua===");
    arrayOfDosen26[indexUsiaTerbesar].printData();
  }

  public void infoDosenPalingMuda(Dosen26[] arrayOfDosen26) {
    int usiaTerkecil = 1000000000;
    int indexUsiaTerkecil = 0;
    for (int i = 0; i < arrayOfDosen26.length; i++) {
      if (arrayOfDosen26[i].usia < usiaTerkecil) {
        usiaTerkecil = arrayOfDosen26[i].usia;
        indexUsiaTerkecil = i;
      }
    }
    System.out.println("===Data Dosen Paling Muda===");
    arrayOfDosen26[indexUsiaTerkecil].printData();
  }
}
