import java.util.Scanner;

class QueueMain {

  public static void menu() {
    System.out.println();
    System.out.println("Masukkan operasi yang diinginkan");
    System.out.println("1. Enqueue");
    System.out.println("2. Dequeue");
    System.out.println("3. Print");
    System.out.println("4. Peek");
    System.out.println("5. Clear");
    System.out.println("--------------------------------");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan kapasitas queue: ");
    int n = sc.nextInt();

    Queue Q = new Queue(n);

    int pilih;
    do {
      menu();
      System.out.print("> ");
      pilih = sc.nextInt();
      switch (pilih) {
        case 1:
          if (Q.isFull()) {
            System.out.println("Queue sudah penuh.");
            return;
          }
          System.out.print("Masukkan data baru: ");
          int dataMasuk = sc.nextInt();
          Q.Enqueue(dataMasuk);
          break;
        case 2:
          if (Q.isEmpty()) {
            System.out.println("Queue masih kosong.");
            return;
          }
          int dataKeluar = Q.Dequeue();
          if (dataKeluar != 0) {
            System.out.println("Data yang keluarkan: " + dataKeluar);
            break;
          }
        case 3:
          Q.print();
          break;
        case 4:
          Q.peek();
          break;
        case 5:
          Q.clear();
          break;
      }
    } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    sc.close();
  }
}
