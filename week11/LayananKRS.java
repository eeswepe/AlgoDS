import java.util.Scanner;

class LayananKRS {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    AntrianKRS antrian = new AntrianKRS();
    int pilihan;

    do {
      System.out.println("\n=== Menu Antrian Layanan KRS ===");
      System.out.println("1. Tambah Mahasiswa ke Antrian");
      System.out.println("2. Layani Mahasiswa");
      System.out.println("3. Tampilkan Antrian");
      System.out.println("4. Tampilkan 2 Mahasiswa Terdepan");
      System.out.println("5. Tampilkan Mahasiswa Terakhir");
      System.out.println("6. Jumlah Mahasiswa dalam Antrian");
      System.out.println("7. Jumlah Mahasiswa yang sudah melakukan KRS");
      System.out.println("8. Jumlah Mahasiswa yang belum melakukan KRS");
      System.out.println("9. Clear Antrian");
      System.out.println("0. Keluar");
      System.out.print("Pilih Menu: ");
      pilihan = sc.nextInt();

      switch (pilihan) {
        case 1:
          System.out.print("NIM: ");
          String nim = sc.next();
          System.out.print("Nama: ");
          String nama = sc.next();
          System.out.print("Prodi: ");
          String prodi = sc.next();
          System.out.print("Kelas: ");
          String kelas = sc.next();
          Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
          antrian.tambahAntrian(mhs);
          break;
        case 2:
          Mahasiswa[] dilayani = antrian.layaniMahasiswa();
          if (dilayani != null) {
            System.out.print("Melayani Mahasiswa: ");
            dilayani[0].tampilkanData();
            dilayani[1].tampilkanData();
          }
          break;
        case 3:
          antrian.tampilkanSemua();
          break;
        case 4:
          antrian.lihatDuaTerdepan();
          break;
        case 5:
          antrian.lihatTerakhir();
          break;
        case 6:
          antrian.getJumlahAntrian();
          break;
        case 7:
          antrian.getMhsSudahProses();
          break;
        case 8:
          antrian.getMhsBelumProses();
          break;
        case 9:
          antrian.clear();
          break;
        case 0:
          System.out.println("Terimakasih.");
          break;
        default:
          System.out.println("Pilihan tidak valid.");
      }
    } while (pilihan != 0);

    sc.close();
  }
}
