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
      System.out.println("6. Keluar");
      System.out.print("Pilih: ");
      pilihan = sc.nextInt();
      sc.nextLine();

      switch (pilihan) {
        case 1:
          Mahasiswa26 mhsAwal = inputMahasiswa(sc);
          sll.addFirst(mhsAwal);
          System.out.println("Data berhasil ditambahkan di awal.");
          break;
        case 2:
          Mahasiswa26 mhsAkhir = inputMahasiswa(sc);
          sll.addLast(mhsAkhir);
          System.out.println("Data berhasil ditambahkan di akhir.");
          break;
        case 3:
          System.out.print("Masukkan nama mahasiswa yang dicari: ");
          String key = sc.nextLine();
          Mahasiswa26 mhsSetelah = inputMahasiswa(sc);
          sll.insertAfter(key, mhsSetelah);
          System.out.println("Data berhasil ditambahkan setelah " + key);
          break;
        case 4:
          System.out.print("Masukkan index: ");
          int idx = sc.nextInt();
          sc.nextLine();
          Mahasiswa26 mhsIndex = inputMahasiswa(sc);
          sll.insertAt(idx, mhsIndex);
          System.out.println("Data berhasil ditambahkan di index " + idx);
          break;
        case 5:
          sll.print();
          break;
        case 6:
          System.out.println("Terima kasih!");
          break;
        default:
          System.out.println("Pilihan tidak valid.");
      }

    } while (pilihan != 6);
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
