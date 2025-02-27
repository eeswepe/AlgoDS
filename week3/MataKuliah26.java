import java.util.Scanner;

public class MataKuliah26 {
  public String kode;
  public String nama;
  public int sks;
  public int jumlahJam;

  public MataKuliah26() {}

  public MataKuliah26(String kode, String nama, int sks, int jumlahJam) {
    this.kode = kode;
    this.nama = nama;
    this.sks = sks;
    this.jumlahJam = jumlahJam;
  }

  public void tambahData() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Kode       : ");
    this.kode = sc.nextLine();
    System.out.print("Nama       : ");
    this.nama = sc.nextLine();
    System.out.print("SKS        : ");
    this.sks = sc.nextInt();
    // sc.nextLine();
    System.out.print("Jumlah Jam : ");
    this.jumlahJam = sc.nextInt();
  }

  public void cetakInfo() {
    System.out.println("Kode       : " + this.kode);
    System.out.println("Nama       : " + this.nama);
    System.out.println("SKS        : " + this.sks);
    System.out.println("Jumlah Jam : " + this.jumlahJam);
  }
}
