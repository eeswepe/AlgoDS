import java.util.Scanner;

public class MataKuliahDemo26 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan Jumlah Mata Kuliah: ");
    int arrayLength = sc.nextInt();
    System.out.println("--------------------------------");
    MataKuliah26[] arrayOfMatkul = new MataKuliah26[arrayLength];
    // String kode, nama, dummy;
    // int sks, jumlahJam;

    for (int i = 0; i < arrayLength; i++) {
      System.out.println("Masukkan data mata kuliah ke-" + (i + 1));
      arrayOfMatkul[i] = new MataKuliah26();
      arrayOfMatkul[i].tambahData();
      System.out.println("--------------------------------");
    }

    for (int i = 0; i < arrayLength; i++) {
      System.out.println("Data mata kuliah ke-" + (i + 1));
      arrayOfMatkul[i].cetakInfo();
      System.out.println("--------------------------------");
    }
    sc.close();
  }
}
