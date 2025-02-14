import java.util.Scanner;

public class Pemilihan {
  public static boolean isValid(int num) {
    return num >= 0 && num <= 100;
  }

  public static String convert(int grade) {
    if (grade > 80) return "A";
    else if (grade > 73) return "B+";
    else if (grade > 65) return "B";
    else if (grade > 60) return "C+";
    else if (grade > 50) return "C";
    else if (grade > 39) return "D";
    else return "E";
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nilaiTugas, nilaiKuis, nilaiUts, nilaiUas;
    double hasil = 0;

    System.out.print("Nilai Tugas: ");
    nilaiTugas = sc.nextInt();
    System.out.print("Nilai Kuis: ");
    nilaiKuis = sc.nextInt();
    System.out.print("Nilai UTS: ");
    nilaiUts = sc.nextInt();
    System.out.print("Nilai UAS: ");
    nilaiUas = sc.nextInt();

    if (!(isValid(nilaiTugas) && isValid(nilaiKuis) && isValid(nilaiUts) && isValid(nilaiUas))) {
      System.out.println("=================");
      System.out.println("Nilai tidak valid");
      System.out.println("=================");

      sc.close();
      return;
    }

    hasil = (nilaiTugas * 0.2 + nilaiKuis * 0.2 + nilaiUts * 0.3 + nilaiUas * 0.3);

    System.out.println("Nilai akhir: " + hasil);
    System.out.println("Nilai huruf: " + convert((int) hasil));
    if (convert((int) hasil).equalsIgnoreCase("D") || convert((int) hasil).equalsIgnoreCase("E")) {
      System.out.println("=================");
      System.out.println("Anda Tidak Lulus");
      System.out.println("=================");
    } else {
      System.out.println("==================");
      System.out.println("Selamat Anda Lulus");
      System.out.println("==================");
    }

    sc.close();
    return;
  }
}
