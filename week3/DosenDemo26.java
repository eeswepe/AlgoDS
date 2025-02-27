import java.util.Scanner;

public class DosenDemo26 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int jumlahDosen = 3;
    Dosen26[] arrayOfDosen = new Dosen26[jumlahDosen];

    // input data dosen
    for (int i = 0; i < jumlahDosen; i++) {
      String dummy;
      System.out.println("Masukkan Data Dosen ke - " + (i + 1));
      System.out.print("Kode                : ");
      String kode = sc.nextLine();
      System.out.print("Nama                : ");
      String nama = sc.nextLine();
      System.out.print("Jenis Kelamin (L/P) : ");
      dummy = sc.nextLine();
      boolean jenisKelamin = dummy.equals("L") ? true : false;
      System.out.print("Usia                : ");
      int usia = sc.nextInt();
      arrayOfDosen[i] = new Dosen26(kode, nama, jenisKelamin, usia);
      System.out.println("--------------------------------");
      sc.nextLine();
    }

    DataDosen26 dataDosen26 = new DataDosen26();
    dataDosen26.dataSemuaDosen(arrayOfDosen);
    dataDosen26.jumlahDosenPerJenisKelamin(arrayOfDosen);
    dataDosen26.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
    dataDosen26.infoDosenPalingTua(arrayOfDosen);
    dataDosen26.infoDosenPalingMuda(arrayOfDosen);
  }
}
