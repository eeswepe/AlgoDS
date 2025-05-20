import java.util.Scanner;

public class AntrianMain {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan kapasitas maksimal antrian: ");
    int kapasitas = scanner.nextInt();
    scanner.nextLine();
    Antrian antrian = new Antrian(kapasitas);

    int pilihan;
    do {
      System.out.println("\n--- MENU ANTRIAN MAHASISWA ---");
      System.out.println("1. Tambah Antrian");
      System.out.println("2. Proses Antrian");
      System.out.println("3. Cetak Seluruh Antrian");
      System.out.println("4. Tampilkan Mahasiswa Terdepan");
      System.out.println("5. Tampilkan Mahasiswa Terakhir");
      System.out.println("6. Cek Antrian Kosong");
      System.out.println("7. Cek Antrian Penuh");
      System.out.println("8. Lihat Jumlah Mahasiswa dalam Antrian");
      System.out.println("9. Kosongkan Antrian");
      System.out.println("10. Keluar");
      System.out.print("Pilih: ");
      pilihan = scanner.nextInt();
      scanner.nextLine();

      switch (pilihan) {
        case 1:
          if (antrian.isFull()) {
            System.out.println("Antrian penuh, tidak bisa menambah.");
            break;
          }
          System.out.print("Nama: ");
          String nama = scanner.nextLine();
          System.out.print("NIM: ");
          String nim = scanner.nextLine();
          System.out.print("Kelas: ");
          String kelas = scanner.nextLine();
          MhsAntri mhs = new MhsAntri(nama, nim, kelas);
          antrian.insert(mhs);
          break;
        case 2:
          antrian.pop();
          break;
        case 3:
          antrian.print();
          break;
        case 4:
          antrian.tampilTerdepan();
          break;
        case 5:
          antrian.tampilTerakhir();
          break;
        case 6:
          System.out.println(antrian.isEmpty() ? "Antrian kosong." : "Antrian tidak kosong.");
          break;
        case 7:
          System.out.println(antrian.isFull() ? "Antrian penuh." : "Masih ada ruang di antrian.");
          break;
        case 8:
          System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.getCurrentSize());
          break;
        case 9:
          antrian.clear();
          break;
        case 10:
          System.out.println("Terima kasih!");
          break;
        default:
          System.out.println("Pilihan tidak valid.");
      }
    } while (pilihan != 10);

    scanner.close();
  }
}
