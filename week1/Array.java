import java.util.Scanner;

public class Array {
  public static boolean validGrade(String grade) {
    if (grade.equals("A")
        || grade.equals("B+")
        || grade.equals("B")
        || grade.equals("C+")
        || grade.equals("C")
        || grade.equals("D")
        || grade.equals("E")) return true;
    else return false;
  }

  public static double convert(String grade) {
    if (grade.equals("A")) return 4;
    else if (grade.equals("B+")) return 3.5;
    else if (grade.equals("B")) return 3;
    else if (grade.equals("C+")) return 2.5;
    else if (grade.equals("C")) return 2;
    else if (grade.equals("D")) return 1;
    else return 0;
  }

  public static double getGDA(int bobotMatkul[], double nilaiSetara[], int totalSKS) {
    double sum = 0;
    for (int i = 0; i < 8; i++) {
      sum += bobotMatkul[i] * nilaiSetara[i];
    }
    sum /= totalSKS;
    return sum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String dataMatkul[][] = new String[8][2];
    int bobotMatkul[] = new int[8];
    int totalSKS = 0;
    double nilaiSetara[] = new double[8];

    for (int i = 0; i < 8; i++) {
      System.out.print("Masukkan Nama Mata Kuliah: ");
      dataMatkul[i][0] = sc.nextLine();
      System.out.print("Masukkan Nilai Huruf Mata Kuliah " + dataMatkul[i][0] + ": ");
      dataMatkul[i][1] = sc.nextLine();
      nilaiSetara[i] = convert(dataMatkul[i][1]);
      if (validGrade(dataMatkul[i][1]) == false) {
        System.out.println("Nilai Huruf Tidak Valid\nSilahkan isi kembali");
        i--;
        continue;
      }
      System.out.print("Masukkan Bobot SKS Mata Kuliah " + dataMatkul[i][0] + ": ");
      bobotMatkul[i] = sc.nextInt();
      totalSKS += bobotMatkul[i];
      sc.nextLine();
    }

    System.out.println("======================");
    System.out.println("Daftar Nilai Mahasiswa");
    System.out.println("======================");

    System.out.printf(
        "%-40s %-20s %-20s %-20s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot SKS");

    for (int i = 0; i < 8; i++) {
      System.out.printf(
          "%-40s %-20s %-20s %-20s\n",
          dataMatkul[i][0], nilaiSetara[i], dataMatkul[i][1], bobotMatkul[i]);
    }

    double GDA = getGDA(bobotMatkul, nilaiSetara, totalSKS);
    System.out.println("================");
    System.out.println("IP semester: " + GDA);
    System.out.println("================");
  }
}
