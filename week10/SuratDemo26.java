import java.util.Scanner;

class SuratDemo26 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int pilih;
    StackSurat26 stack = new StackSurat26(5);

    do {
      System.out.println("\n------MENU------");
      System.out.println("1. Terima Surat Izin");
      System.out.println("2. Proses Surat Izin");
      System.out.println("3. Melihat Surat Izin Terakhir");
      System.out.println("4. Cari Surat Berdasarkan Nama Mahasiswa");
      System.out.print(" > Pilih : ");
      pilih = sc.nextInt();

      switch (pilih) {
        case 1:
          System.out.println("Masukkan data Surat Izin");
          System.out.print("Masukkan ID Surat Izin: ");
          String idSurat = sc.next();
          System.out.print("Masukkan Nama Mahasiswa: ");
          String namaMahasiswa = sc.next();
          System.out.print("Masukkan Kelas: ");
          String kelas = sc.next();
          System.out.print("Masukkan Jenis Izin: ");
          char jenisIzin = sc.next().charAt(0);
          if (jenisIzin != 'S' && jenisIzin != 'I') {
            System.out.println("Jenis Izin tidak valid.");
            break;
          }
          System.out.print("Masukkan Durasi Surat: ");
          int durasi = sc.nextInt();
          Surat26 surat = new Surat26(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
          stack.push(surat);
          break;
        case 2:
          if (stack.isEmpty()) {
            System.out.println("Tidak ada Surat Izin yang dikumpulkan.");
            break;
          }
          Surat26 suratDiproses = stack.pop();
          System.out.println("Memproses Surat Izin Dari " + suratDiproses.namaMahasiswa);
          suratDiproses.cetakSurat();
          break;
        case 3:
          if (stack.isEmpty()) {
            System.out.println("Tidak ada Surat Izin yang dikumpulkan.");
            break;
          }
          Surat26 suratTerakhir = stack.peek();
          System.out.println("Surat Izin Terakhir : " + suratTerakhir.namaMahasiswa);
          suratTerakhir.cetakSurat();
          break;
        case 4:
          System.out.println("Cari Surat Berdasarkan Nama Mahasiswa");
          System.out.print("Masukkan Nama Mahasiswa: ");
          String cari = sc.next();
          stack.cariSurat(cari);
          break;
        default:
          System.out.println("Pilihan tidak valid.");
          break;
      }
    } while (pilih >= 1 && pilih <= 4);
  }
}
