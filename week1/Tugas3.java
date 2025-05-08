import java.util.Scanner;

public class Tugas3 {

  public static Scanner sc = new Scanner(System.in);

  public static void inputDataMatkul(
      int n, String namaMatkul[], int sksMatkul[], int semesterMatkul[], String hariMatkul[]) {
    for (int i = 0; i < n; i++) {
      System.out.print(">> Masukkan Nama Mata Kuliah: ");
      namaMatkul[i] = sc.nextLine();
      System.out.print(">> Masukkan SKS Mata Kuliah: ");
      sksMatkul[i] = sc.nextInt();
      System.out.print(">> Masukkan Semester Mata Kuliah: ");
      semesterMatkul[i] = sc.nextInt();
      sc.nextLine();
      System.out.print(">> Masukkan Hari Mata Kuliah: ");
      hariMatkul[i] = sc.nextLine();
      System.out.println();
    }
  }

  public static void printDataMatkul(
      int n, String namaMatkul[], int sksMatkul[], int semesterMatkul[], String hariMatkul[]) {
    System.out.printf("%-40s %-20s %-20s %-20s\n", "Mata Kuliah", "SKS", "Semester", "Hari");
    System.out.println(
        "-----------------------------------------------------------------------------------------------");

    for (int i = 0; i < namaMatkul.length; i++) {
      System.out.printf(
          "%-40s %-20d %-20d %-20s\n",
          namaMatkul[i], sksMatkul[i], semesterMatkul[i], hariMatkul[i]);
    }
  }

  public static void findByDay(
      int n,
      String namaMatkul[],
      int sksMatkul[],
      int semesterMatkul[],
      String hariMatkul[],
      String inputDay) {
    System.out.printf("%-40s %-20s %-20s %-20s\n", "Mata Kuliah", "SKS", "Semester", "Hari");
    System.out.println(
        "-----------------------------------------------------------------------------------------------");

    boolean found = false;
    for (int i = 0; i < namaMatkul.length; i++) {
      if (hariMatkul[i].equalsIgnoreCase(inputDay)) {
        System.out.printf(
            "%-40s %-20d %-20d %-20s\n",
            namaMatkul[i], sksMatkul[i], semesterMatkul[i], hariMatkul[i]);
        found = true;
      }
    }
    if (!found) {
      System.out.println("Data mata kuliah pada hari " + inputDay + " tidak ditemukan");
    }
  }

  public static void findBySemester(
      int n,
      String namaMatkul[],
      int sksMatkul[],
      int semesterMatkul[],
      String hariMatkul[],
      int semester) {
    System.out.printf("%-40s %-20s %-20s %-20s\n", "Mata Kuliah", "SKS", "Semester", "Hari");
    System.out.println(
        "-----------------------------------------------------------------------------------------------");

    boolean found = false;
    for (int i = 0; i < namaMatkul.length; i++) {
      if (semesterMatkul[i] == semester) {
        System.out.printf(
            "%-40s %-20d %-20d %-20s\n",
            namaMatkul[i], sksMatkul[i], semesterMatkul[i], hariMatkul[i]);
        found = true;
      }
    }
    if (!found) {
      System.out.println("Data mata kuliah pada semester " + semester + " tidak ditemukan");
    }
  }

  public static void findByName(
      int n,
      String namaMatkul[],
      int sksMatkul[],
      int semesterMatkul[],
      String hariMatkul[],
      String inputName) {
    System.out.printf("%-40s %-20s %-20s %-20s\n", "Mata Kuliah", "SKS", "Semester", "Hari");
    System.out.println(
        "-----------------------------------------------------------------------------------------------");

    boolean found = false;
    for (int i = 0; i < namaMatkul.length; i++) {
      if (namaMatkul[i].equalsIgnoreCase(inputName)) {
        System.out.printf(
            "%-40s %-20d %-20d %-20s\n",
            namaMatkul[i], sksMatkul[i], semesterMatkul[i], hariMatkul[i]);
        found = true;
      }
    }
    if (!found) {
      System.out.println("Data mata kuliah dengan nama " + inputName + " tidak ditemukan");
    }
  }

  public static void main(String[] args) {
    System.out.print("Masukkan Jumlah Mata Kuliah: ");
    int n = sc.nextInt();
    String namaMatkul[] = new String[n];
    int sksMatkul[] = new int[n];
    int semesterMatkul[] = new int[n];
    String hariMatkul[] = new String[n];
    sc.nextLine();
    inputDataMatkul(n, namaMatkul, sksMatkul, semesterMatkul, hariMatkul);
    while (true) {
      System.out.println("Progam Mata Kuliah");
      System.out.println("1. Menampilkan Data Mata Kuliah");
      System.out.println("2. Mencari Mata Kuliah Berdasarkan Hari");
      System.out.println("3. Mencari Mata Kuliah Berdasarkan Semester");
      System.out.println("4. Mencari Mata Kuliah Berdasarkan Nama");
      System.out.println("5. Keluar");
      System.out.print("Silahkan Pilih Menu Program dibawah ini: ");
      int pilihan = sc.nextInt();
      sc.nextLine();
      switch (pilihan) {
        case 1:
          printDataMatkul(n, namaMatkul, sksMatkul, semesterMatkul, hariMatkul);
          break;
        case 2:
          System.out.print("Masukkan Hari Mata Kuliah: ");
          String inputDay = sc.nextLine();
          findByDay(n, namaMatkul, sksMatkul, semesterMatkul, hariMatkul, inputDay);
          break;
        case 3:
          System.out.print("Masukkan Semester Mata Kuliah: ");
          int inputSemester = sc.nextInt();
          findBySemester(n, namaMatkul, sksMatkul, semesterMatkul, hariMatkul, inputSemester);
          break;
        case 4:
          System.out.print("Masukkan Nama Mata Kuliah: ");
          String inputName = sc.nextLine();
          findByName(n, namaMatkul, sksMatkul, semesterMatkul, hariMatkul, inputName);
          break;
        case 5:
          System.out.println("Program Selesai");
          return;
        default:
          System.out.println("Pilihan Tidak Tersedia");
          break;
      }
    }
  }
}
