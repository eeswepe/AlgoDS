import java.util.Scanner;

public class MainSum {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan jumlah elemen: ");
    int element = input.nextInt();

    Sum sm = new Sum(element);
    for (int i = 0; i < element; i++) {
      System.out.print("Masukkan keuntungan ke " + (i + 1) + ": ");
      sm.keuntungan[i] = input.nextDouble();
    }
    System.out.println("Total keuntungan menggunakan BF: " + sm.totalBF());
    System.out.println(
        "Total keuntungan menggunakan DC: "
            + sm.totalDC(sm.keuntungan, 0, sm.keuntungan.length - 1));
  }
}
