import java.util.Scanner;

public class Tugas2 {
  public static int volume(int s) {
    return s * s * s;
  }

  public static int surfaceArea(int s) {
    return 6 * s * s;
  }

  public static int edgeLength(int s) {
    return 12 * s;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      int sisi;
      System.out.println(
          "Pilih Program Dibawah ini: \n"
              + "1. Volume Kubus \n"
              + "2. Luas Permukaan Kubus \n"
              + "3. Panjang Sisi (rusuk) \n"
              + "4. Keluar");
      System.out.print(" >> ");
      int pilihan = sc.nextInt();
      switch (pilihan) {
        case 1:
          System.out.print("Masukkan Panjang sisi kubus: ");
          sisi = sc.nextInt();
          int volume = volume(sisi);
          System.out.println("Volume Kubus adalah " + volume + " satuan kubik");
          break;
        case 2:
          System.out.print("Masukkan Panjang sisi kubus: ");
          sisi = sc.nextInt();
          int surfaceArea = surfaceArea(sisi);
          System.out.println("Luas Permukaan Kubus adalah " + surfaceArea + " satuan persegi");
          break;
        case 3:
          System.out.print("Masukkan Panjang sisi kubus: ");
          sisi = sc.nextInt();
          int edgeLength = edgeLength(sisi);
          System.out.println("Panjang Keliling (rusuk) adalah " + edgeLength + " satuan");
          break;
        case 4:
          System.out.println("Program Selesai");
          return;
        default:
          System.out.println("pilihan tidak valid\nSilahkan pilih menu lagi");
          break;
      }
    }
  }
}
