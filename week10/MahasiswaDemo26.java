import java.util.Scanner;

class MahasiswaDemo26 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StackTugasMahasiswa26 stack = new StackTugasMahasiswa26(5);
    int pilih;
    do {
      System.out.println("\nMenu: ");
      System.out.println("1. Mengumpulkan Tugas");
      System.out.println("2. Menilai Tugas");
      System.out.println("3. Melihat Daftar Tugas Teratas");
      System.out.println("4. Melihat Daftar Tugas");
      System.out.println("5. Lihat Tugas Terbawah");
      System.out.println("6. Jumlah Tugas yang Sudah Dikumpulkan");
      System.out.print("Pilih: ");
      pilih = sc.nextInt();
      sc.nextLine();

      switch (pilih) {
        case 1:
          System.out.print("Nama: ");
          String nama = sc.nextLine();
          System.out.print("NIM: ");
          String nim = sc.nextLine();
          System.out.print("Kelas: ");
          String kelas = sc.nextLine();
          Mahasiswa26 mhs = new Mahasiswa26(nim, nama, kelas);
          stack.push(mhs);
          System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
          break;
        case 2:
          Mahasiswa26 dinilai = stack.pop();
          if (dinilai != null) {
            System.out.printf("Menilai tugas dari %s.\n", dinilai.nama);
            System.out.print("Masukkan nilai: ");
            int nilai = sc.nextInt();
            dinilai.tugasDinilai(nilai);
            stack.push(dinilai);
            System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
            String biner = stack.konversiDesimalKeBiner(nilai);
            System.out.printf("Nilai Tugas Biner: %s\n", biner);
          }
          break;
        case 3:
          Mahasiswa26 lihat = stack.peek();
          System.out.printf("Tugas terakhir dikumpulkan oleh %s.\n", lihat.nama);
          break;
        case 4:
          System.out.println("Daftar Semua Tugas");
          System.out.println("Nama\tNIM\tKelas");
          stack.print();
          break;
        case 5:
          Mahasiswa26 mshTerbawah = stack.lihatTerbawah();
          System.out.printf("Tugas terbawah dikumpulkan oleh %s.\n", lihat.nama);
          break;
        case 6:
          stack.jumlahTugas();
          break;
        default:
          System.out.println("Pilihan tidak valid");
      }
    } while (pilih >= 1 && pilih <= 4);

    sc.close();
  }
}
