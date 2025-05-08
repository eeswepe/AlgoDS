import java.util.Scanner;

public class Siakad {
  public static void main(String[] args) {
    // Data Dummy Mahasiswa

    Mahasiswa[] mahasiswaArray = new Mahasiswa[5];

    mahasiswaArray[0] = new Mahasiswa("22001", "Ali Rahman");
    mahasiswaArray[1] = new Mahasiswa("22002", "Budi Santoso");
    mahasiswaArray[2] = new Mahasiswa("22003", "Citra Dewi");
    mahasiswaArray[3] = new Mahasiswa("22004", "Deni Saputra");
    mahasiswaArray[4] = new Mahasiswa("22005", "Eka Wulandari");

    // Data Dummy Matakuliah

    MataKuliah[] mataKuliahArray = new MataKuliah[3];

    mataKuliahArray[0] = new MataKuliah("MK001", "Struktur Data", 3);
    mataKuliahArray[1] = new MataKuliah("MK002", "Basis Data", 3);
    mataKuliahArray[2] = new MataKuliah("MK003", "Desain Web", 2);

    // Data Dummy Absensi

    Absensi[] absensiArray = new Absensi[7];

    absensiArray[0] = new Absensi(mahasiswaArray[0], mataKuliahArray[0], 10, 1, 1, 0);
    absensiArray[1] = new Absensi(mahasiswaArray[0], mataKuliahArray[1], 12, 0, 1, 1);
    absensiArray[2] = new Absensi(mahasiswaArray[1], mataKuliahArray[0], 14, 0, 0, 0);
    absensiArray[3] = new Absensi(mahasiswaArray[2], mataKuliahArray[1], 9, 2, 1, 2);
    absensiArray[4] = new Absensi(mahasiswaArray[2], mataKuliahArray[2], 10, 0, 0, 2);
    absensiArray[5] = new Absensi(mahasiswaArray[3], mataKuliahArray[2], 13, 0, 0, 0);
    absensiArray[6] = new Absensi(mahasiswaArray[4], mataKuliahArray[0], 11, 1, 1, 1);

    DataMataKuliah dataMataKuliah = new DataMataKuliah(mataKuliahArray);
    DataMahasiswa dataMahasiswa = new DataMahasiswa(mahasiswaArray);
    DataAbsensi dataAbsensi = new DataAbsensi(absensiArray);

    Scanner sc = new Scanner(System.in);
    Scanner nimSc = new Scanner(System.in);
    while (true) {
      System.out.println("Menu : ");
      System.out.println("1. Tampilkan data mahasiswa");
      System.out.println("2. Tampilkan data matakuliah");
      System.out.println("3. Tampilkan data absensi");
      System.out.println("4. Urutkan data absensi berdasarkan persentase kehadiran");
      System.out.println("5. Cari data absensi berdasarkan NIM");
      System.out.println("6. Mencari data mahasiswa dengan Alpha Terbanyak");
      System.out.println("0. Keluar");

      System.out.print("Masukkan pilihan anda: ");
      int pilihan = sc.nextInt();
      System.out.println("-------------------------------");
      switch (pilihan) {
        case 1:
          dataMahasiswa.tampilMahasiswa();
          System.out.println("-------------------------------");
          break;
        case 2:
          dataMataKuliah.tampilMatakuliah();
          System.out.println("-------------------------------");
          break;
        case 3:
          dataAbsensi.tampilAbsensi();
          System.out.println("-------------------------------");
          break;
        case 4:
          dataAbsensi.sortAbsensi();
          dataAbsensi.tampilAbsensi();
          System.out.println("-------------------------------");
          break;
        case 5:
          System.out.print("Masukkan NIM yg dicari : ");
          String nimCari = nimSc.nextLine();
          dataAbsensi.sequntialSearching(nimCari);
          System.out.println("-------------------------------");
          break;
        case 6:
          System.out.println("-------------------------------");
          dataAbsensi.jumlahAlpha();
          dataMahasiswa.tampilAlphaTerbanyak();
          break;
        case 0:
          System.out.println("=== TERIMA KASIH :) ===");
          return;
        default:
          System.out.println("Pilihan tidak tersedia");
          break;
      }
    }
  }
}
