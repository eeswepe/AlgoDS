import java.util.Scanner;

public class MahasiswaDemo26 {
  public static void main(String[] args) {
    Mahasiswa26[] arrayOfMahasiswa = new Mahasiswa26[3];
    Scanner sc = new Scanner(System.in);
    String dummy;

    for (int i = 0; i < 3; i++) {
      arrayOfMahasiswa[i] = new Mahasiswa26();

      System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
      System.out.print("NIM    : ");
      arrayOfMahasiswa[i].nim = sc.nextLine();
      System.out.print("Nama   : ");
      arrayOfMahasiswa[i].nama = sc.nextLine();
      System.out.print("Kelas  : ");
      arrayOfMahasiswa[i].kelas = sc.nextLine();
      System.out.print("IPK    : ");
      dummy = sc.nextLine();
      arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
      System.out.println("--------------------------------");
    }

    for (int i = 0; i < 3; i++) {
      System.out.println("Data mahasiswa ke-" + (i + 1));
      arrayOfMahasiswa[i].cekInfo();
      System.out.println("--------------------------------");
    }
  }
}
