import java.util.Scanner;

public class Perulangan {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan NIM: ");
    String nim = sc.nextLine();

    int n = Integer.parseInt(nim.substring(nim.length() - 2, nim.length()));

    n = n >= 10 ? n : n + 10;
    System.out.println("n = " + n);

    for (int i = 1; i <= n; i++) {
      if (i == 6 || i == 10) {
        continue;
      }
      if (i % 2 == 1) {
        System.out.print("* ");
      } else {
        System.out.print(i + " ");
      }
    }
  }
}
