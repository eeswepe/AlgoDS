import java.util.Scanner;

public class DLLMain26 {
  static Scanner sc = new Scanner(System.in);

  public static Mahasiswa26 inputMahasiswa() {
    String nama, nim, kelas;
    double ipk;
    System.out.print("> Masukkan nama: ");
    nama = sc.nextLine();
    System.out.print("> Masukkan nim: ");
    nim = sc.nextLine();
    System.out.print("> Masukkan kelas: ");
    kelas = sc.nextLine();
    System.out.print("> Masukkan ipk: ");
    ipk = sc.nextDouble();
    sc.nextLine();

    return new Mahasiswa26(nama, nim, kelas, ipk);
  }

  public static void main(String[] args) {
    DoubleLinkedList26 list = new DoubleLinkedList26();
    int pilihan;

    do {
      System.out.println("\nMenu Double Linked List Mahasiswa");
      System.out.println("1 Tambah berdasarkan index");
      System.out.println("2. Tambah di awal");
      System.out.println("3. Tambah di akhir");
      System.out.println("4. Hapus di awal");
      System.out.println("5. Hapus di akhir");
      System.out.println("6. Tampilkan data");
      System.out.println("7. Cari mahasiswa berdasarkan NIM");
      System.out.println("0. Keluar");

      System.out.print("> Pilih Menu : ");
      pilihan = sc.nextInt();
      sc.nextLine();

      switch (pilihan) {
        case 1:
          {
            System.out.print("Masukkan indeks yang akan disisipkan: ");
            int index = sc.nextInt();
            sc.nextLine();
            Mahasiswa26 mhs = inputMahasiswa();
            list.add(mhs, index);
            break;
          }
        case 2:
          {
            Mahasiswa26 mhs = inputMahasiswa();
            list.addFirst(mhs);
            break;
          }
        case 3:
          {
            Mahasiswa26 mhs = inputMahasiswa();
            list.addLast(mhs);
            break;
          }
        case 4:
          {
            list.removeFirst();
            break;
          }
        case 5:
          {
            list.removeLast();
            break;
          }
        case 6:
          {
            list.print();
            break;
          }
        case 7:
          {
            System.out.print("Masukkan NIM yang dicari: ");
            String keyNIM = sc.nextLine();
            Node26 result = list.search(keyNIM);
            if (result != null) {
              System.out.print("Data ditemukan: ");
            } else {
              System.out.println("Data tidak ditemukan");
            }
          }
        case 0:
          System.out.println("Keluar dari program");
        default:
          System.out.println("Pilihan tidak valid.");
      }
    } while (pilihan != 0);
  }
}
