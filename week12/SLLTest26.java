public class SLLTest26 {
  public static void main(String[] args) {
    SingleLinkedList26 sll = new SingleLinkedList26();

    sll.addLast(new Mahasiswa26("12301", "Adit", "1A", 3.5));
    sll.addLast(new Mahasiswa26("12302", "Bimon", "1A", 3.8));
    sll.addLast(new Mahasiswa26("12303", "Citra", "1A", 3.2));
    sll.addLast(new Mahasiswa26("12304", "Dinda", "1A", 3.6));

    System.out.println("=== Isi Linked List Awal ===");
    sll.print();

    System.out.println("Data pada index 1:");
    sll.getData(1);

    System.out.println("\nIndex mahasiswa bernama Bimon:");
    int index = sll.indexOf("Bimon");
    System.out.println("Mahasiswa Bimon berada pada index: " + index);

    System.out.println("\nMenghapus data pertama:");
    sll.removeFirst();
    sll.print();

    System.out.println("Menghapus data terakhir:");
    sll.removeLast();
    sll.print();

    System.out.println("Menghapus data pada index 0:");
    sll.removeAt(0);
    sll.print();
  }
}
