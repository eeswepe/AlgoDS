import java.util.Scanner;

class KlinikMain {
  static Scanner sc = new Scanner(System.in);

  public static Pasien inputPasien() {
    sc.nextLine();

    System.out.println("Masukkan data Pasien");
    System.out.print("Nama Pasien: ");
    String nama = sc.nextLine();
    System.out.print("NIK Pasien: ");
    String nik = sc.nextLine();
    System.out.print("Keluhan Pasien: ");
    String keluhan = sc.nextLine();

    return new Pasien(nama, nik, keluhan);
  }

  public static Dokter inputDokter() {
    sc.nextLine();

    System.out.println("Masukkan data Dokter");
    System.out.print("ID Dokter:");
    String id = sc.nextLine();
    System.out.print("Nama Dokter: ");
    String nama = sc.nextLine();

    return new Dokter(id, nama);
  }

  public static void main(String[] args) {
    int pilihan;
    AntrianPasien antrian = new AntrianPasien();
    AntrianTransaksi transaksi = new AntrianTransaksi(100);

    do {
      System.out.println("\n=== Sistem Antrian Klinik ===");
      System.out.println("1. Tambah Pasien ke Antrian");
      System.out.println("2. Lihat Antrian");
      System.out.println("3. Layani Pasien");
      System.out.println("4. Cek Sisa Antrian Pasien");
      System.out.println("5. Lihat Riwayat Transaksi");
      System.out.println("6. Slice Riwayat Transaksi");
      System.out.println("0. Keluar");
      System.out.print("> Pilih: ");
      pilihan = sc.nextInt();

      switch (pilihan) {
        case 1:
          Pasien pasien = inputPasien();
          antrian.tambahPasien(pasien);
          break;
        case 2:
          antrian.tampilkanAntrian();
          break;
        case 3:
          Pasien dilayani = antrian.layaniPasien();
          if (dilayani == null) {
            System.out.println("Antrian Pasien Kosong");
            break;
          }
          Dokter dokter = inputDokter();
          System.out.print("Durasi Layanan (jam): ");
          int durasi = sc.nextInt();
          TransaksiLayanan transaksiLayanan = new TransaksiLayanan(dilayani, dokter, durasi);
          transaksi.tambahTransaksi(transaksiLayanan);
          System.out.println("Pasien Berhasil Dilayani, Transaksi Berhasil Dicatat");
          break;
        case 4:
          antrian.sisaPasien();
          break;
        case 5:
          transaksi.tampilkanRiwayat();
        case 6:
          System.out.println("Masukan urutan elemen pertama");
          int start = sc.nextInt();
          System.out.println("Masukan urutan elemen terakhir");
          int end = sc.nextInt();
          transaksi.tampilSlice(transaksi.slice(start, end));
          break;
      }
    } while (pilihan != 0);
  }
}
