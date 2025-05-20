import java.util.Scanner;

public class SLLMain26 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    SingleLinkedList26 sll = new SingleLinkedList26();
    int pilihan;

    do {
      System.out.println("\n=== MENU ===");
      System.out.println("1. Tambah Mahasiswa di Awal");
      System.out.println("2. Tambah Mahasiswa di Akhir");
      System.out.println("3. Tambah Mahasiswa Setelah Nama Tertentu");
      System.out.println("4. Tambah Mahasiswa di Index Tertentu");
      System.out.println("5. Tampilkan Daftar Mahasiswa");
      System.out.println("6. Tampilkan Data Berdasarkan Index");
      System.out.println("7. Cari Index Mahasiswa Berdasarkan Nama");
      System.out.println("8. Hapus Mahasiswa di Awal");
      System.out.println("9. Hapus Mahasiswa di Akhir");
      System.out.println("10. Hapus Mahasiswa Berdasarkan Nama");
      System.out.println("11. Hapus Mahasiswa Berdasarkan Index");
      System.out.println("12. Keluar");
      System.out.print("Pilih: ");
      pilihan = sc.nextInt();
      sc.nextLine();

      switch (pilihan) {
        case 1:
          sll.addFirst(inputMahasiswa(sc));
          break;
        case 2:
          sll.addLast(inputMahasiswa(sc));
          break;
        case 3:
          System.out.print("Masukkan nama mahasiswa yang dicari: ");
          String key = sc.nextLine();
          sll.insertAfter(key, inputMahasiswa(sc));
          break;
        case 4:
          System.out.print("Masukkan index: ");
          int idxTambah = sc.nextInt();
          sc.nextLine();
          sll.insertAt(idxTambah, inputMahasiswa(sc));
          break;
        case 5:
          sll.print();
          break;
        case 6:
          System.out.print("Masukkan index: ");
          int idxTampil = sc.nextInt();
          sc.nextLine();
          sll.getData(idxTampil);
          break;
        case 7:
          System.out.print("Masukkan nama mahasiswa: ");
          String cariNama = sc.nextLine();
          int posisi = sll.indexOf(cariNama);
          if (posisi != -1) {
            System.out.println("Index mahasiswa " + cariNama + ": " + posisi);
          } else {
            System.out.println("Mahasiswa tidak ditemukan.");
          }
          break;
        case 8:
          sll.removeFirst();
          break;
        case 9:
          sll.removeLast();
          break;
        case 10:
          System.out.print("Masukkan nama mahasiswa yang ingin dihapus: ");
          String namaHapus = sc.nextLine();
          sll.remove(namaHapus);
          break;
        case 11:
          System.out.print("Masukkan index yang ingin dihapus: ");
          int idxHapus = sc.nextInt();
          sc.nextLine();
          sll.removeAt(idxHapus);
          break;
        case 12:
          System.out.println("Terima kasih!");
          break;
        default:
          System.out.println("Pilihan tidak valid.");
      }

    } while (pilihan != 12);
  }

  public static Mahasiswa26 inputMahasiswa(Scanner sc) {
    System.out.print("NIM: ");
    String nim = sc.nextLine();
    System.out.print("Nama: ");
    String nama = sc.nextLine();
    System.out.print("Kelas: ");
    String kelas = sc.nextLine();
    System.out.print("IPK: ");
    double ipk = sc.nextDouble();
    sc.nextLine();
    return new Mahasiswa26(nim, nama, kelas, ipk);
  }
}
