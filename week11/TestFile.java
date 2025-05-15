// ini file supaya saya ga keseringan input lewat Scanner pak, soalnya udah ngetik 3 kali manual ada
// aja yang kelewat
public class TestFile {
  public static void main(String[] args) {
    AntrianKRS antrian = new AntrianKRS();

    System.out.println("\n#Case: Input beberapa mahasiswa ke antrian");
    antrian.tambahAntrian(new Mahasiswa("123", "Alice", "Informatika", "A"));
    antrian.tambahAntrian(new Mahasiswa("124", "Bob", "Informatika", "B"));
    antrian.tambahAntrian(new Mahasiswa("125", "Charlie", "Informatika", "C"));
    antrian.tambahAntrian(new Mahasiswa("126", "Diana", "Informatika", "D"));
    antrian.tambahAntrian(new Mahasiswa("127", "Eve", "Informatika", "E"));

    System.out.println("\n#Case: Tampilkan semua mahasiswa dalam antrian");
    antrian.tampilkanSemua();

    System.out.println("\n#Case: Tampilkan 2 mahasiswa terdepan");
    antrian.lihatDuaTerdepan();

    System.out.println("\n#Case: Layani 2 mahasiswa terdepan");
    Mahasiswa[] dilayani = antrian.layaniMahasiswa();
    if (dilayani != null) {
      System.out.println("Melayani mahasiswa:");
      dilayani[0].tampilkanData();
      dilayani[1].tampilkanData();
    }

    System.out.println("\n#Case: Tampilkan semua mahasiswa setelah pelayanan");
    antrian.tampilkanSemua();

    System.out.println("\n#Case: Tampilkan mahasiswa terakhir");
    antrian.lihatTerakhir();

    System.out.println("\n#Case: Tampilkan jumlah antrian");
    antrian.getJumlahAntrian();

    System.out.println("\n#Case: Tampilkan mahasiswa yang sudah melakukan KRS");
    antrian.getMhsSudahProses();

    System.out.println("\n#Case: Tampilkan mahasiswa yang belum melakukan KRS");
    antrian.getMhsBelumProses();

    System.out.println("\n#Case: Clear antrian");
    antrian.clear();

    System.out.println("\n#Case: Coba tampilkan semua antrian setelah clear");
    antrian.tampilkanSemua();
  }
}
