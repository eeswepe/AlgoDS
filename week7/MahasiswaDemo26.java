import java.util.Scanner;

public class MahasiswaDemo26 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan Jumlah Mahasiswa : ");
    int jumMhs = sc.nextInt();
    MahasiswaBerprestasi26 list = new MahasiswaBerprestasi26(jumMhs);

    // ini data dummy pak, biar pas debugging ga sering ngetik buat input :))
    // Mahasiswa26[] dataMahasiswa = {
    //  new Mahasiswa26("111", "adi", "2", 3.6),
    //  new Mahasiswa26("222", "tio", "2", 3.8),
    //  new Mahasiswa26("333", "ila", "2", 3.0),
    //  new Mahasiswa26("444", "lia", "2", 3.5),
    //  new Mahasiswa26("555", "fia", "2", 3.3)
    // };
    // Mahasiswa26[] dataMahasiswa = {
    //  new Mahasiswa26("333", "ila", "2", 3.0),
    //  new Mahasiswa26("555", "fia", "2", 3.2),
    //  new Mahasiswa26("444", "lia", "2", 3.4),
    //  new Mahasiswa26("111", "adi", "2", 3.6),
    //  new Mahasiswa26("222", "tio", "2", 3.7)
    // };

    // for (int i = 0; i < jumMhs; i++) {
    //  list.tambah(dataMahasiswa[i]);
    // }

    for (int i = 0; i < jumMhs; i++) {
      System.out.println("Masukkan Data Mahasiswa Ke-" + (i + 1));
      System.out.print("NIM : ");
      String nim = sc.next();
      System.out.print("Nama : ");
      String nama = sc.next();
      System.out.print("Kelas : ");
      String kelas = sc.next();
      System.out.print("IPK : ");
      double ipk = sc.nextDouble();
      System.out.println("---------------------");
      list.tambah(new Mahasiswa26(nim, nama, kelas, ipk));
    }

    // sequential searching
    // list.tampil();
    // System.out.println("---------------------");
    // System.out.println("Pencarian Data");
    // System.out.println("---------------------");
    //
    // System.out.print("Masukkan IPK yang dicari : ");
    // double cari = sc.nextDouble();
    //
    // System.out.println("Menggunakan sequential searching");
    // int pos = list.sequentialSearching(cari);
    // list.tampilPosisi(cari, pos);
    // list.tampilDataSearch(cari, pos);

    // binary search

    list.tampil();
    System.out.println("---------------------");
    System.out.println("Pencarian Data");
    System.out.println("---------------------");

    System.out.print("Masukkan IPK yang dicari : ");
    double cari = sc.nextDouble();

    System.out.println("Menggunakan binary search");
    int pos = list.findBinarySearch(cari, 0, jumMhs - 1);
    list.tampilPosisi(cari, pos);
    list.tampilDataSearch(cari, pos);
  }
}
