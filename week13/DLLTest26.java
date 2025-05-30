public class DLLTest26 {
  public static void main(String[] args) {
    System.out.println("=== TEST DOUBLE LINKED LIST MAHASISWA ===");

    DoubleLinkedList26 list = new DoubleLinkedList26();

    // TEST 1: isEmpty - Initial State
    System.out.println("\n[TEST 1] Cek apakah list kosong (awal):");
    System.out.println("List kosong? " + (list.isEmpty() ? "Ya" : "Tidak"));

    // TEST 2: addFirst
    System.out.println("\n[TEST 2] Tambah Mahasiswa di awal (Ani, Budi)");
    list.addFirst(new Mahasiswa26("Ani", "123", "IF-A", 3.85));
    list.addFirst(new Mahasiswa26("Budi", "124", "IF-B", 3.50));
    System.out.println("Isi list setelah addFirst:");
    list.print();

    // TEST 3: addLast
    System.out.println("\n[TEST 3] Tambah Mahasiswa di akhir (Citra)");
    list.addLast(new Mahasiswa26("Citra", "125", "IF-C", 3.90));
    System.out.println("Isi list setelah addLast:");
    list.print();

    // TEST 4: isEmpty - After additions
    System.out.println("\n[TEST 4] Cek apakah list kosong (setelah penambahan):");
    System.out.println("List kosong? " + (list.isEmpty() ? "Ya" : "Tidak"));

    // TEST 5: search - Found
    System.out.println("\n[TEST 5] Cari mahasiswa dengan NIM '123' (Ani)");
    Node26 foundNode1 = list.search("123");
    if (foundNode1 != null) {
      System.out.print("Data ditemukan: ");
      foundNode1.data.tampil();
    } else {
      System.out.println("Data tidak ditemukan.");
    }

    // TEST 6: search - Not Found
    System.out.println("\n[TEST 6] Cari mahasiswa dengan NIM '999' (tidak ada)");
    Node26 foundNode2 = list.search("999");
    if (foundNode2 != null) {
      System.out.print("Data ditemukan: ");
      foundNode2.data.tampil();
    } else {
      System.out.println("Data tidak ditemukan.");
    }

    // --- FITUR BARU: add(item, index) ---
    // Pastikan list memiliki setidaknya 3 elemen sebelum test ini
    // (Budi, Ani, Citra)

    // TEST 7: add(item, index) - Insert at index 1 (antara Budi dan Ani)
    System.out.println("\n[TEST 7] Tambah Mahasiswa 'Dina' pada indeks 1");
    // List saat ini: Budi (0), Ani (1), Citra (2)
    // Setelah add(Dina, 1): Budi (0), Dina (1), Ani (2), Citra (3)
    list.add(new Mahasiswa26("Dina", "126", "IF-D", 3.65), 1);
    System.out.println("Isi list setelah add(Dina, 1):");
    list.print();

    // TEST 8: add(item, index) - Insert at beginning (index 0)
    System.out.println("\n[TEST 8] Tambah Mahasiswa 'Eko' pada indeks 0");
    // List saat ini: Budi, Dina, Ani, Citra
    // Setelah add(Eko, 0): Eko, Budi, Dina, Ani, Citra
    list.add(new Mahasiswa26("Eko", "127", "IF-E", 3.70), 0);
    System.out.println("Isi list setelah add(Eko, 0):");
    list.print();

    // TEST 9: add(item, index) - Insert at a known specific index, e.g., index 4
    // (Jika list sudah memiliki cukup elemen, misalkan: Eko, Budi, Dina, Ani, Citra)
    // Indeks 4 akan menjadi posisi setelah Ani (yaitu sebelum Citra yang sekarang di index 5)
    // Sehingga menjadi Eko, Budi, Dina, Ani, Fina, Citra
    System.out.println("\n[TEST 9] Tambah Mahasiswa 'Fina' pada indeks 4 (setelah Ani)");
    list.add(new Mahasiswa26("Fina", "128", "IF-F", 3.95), 4);
    System.out.println("Isi list setelah add(Fina, 4):");
    list.print();

    // TEST 10: add(item, index) - Invalid index (negative)
    System.out.println("\n[TEST 10] Tambah Mahasiswa 'Gita' pada indeks -1 (invalid)");
    list.add(new Mahasiswa26("Gita", "129", "IF-G", 3.00), -1);
    System.out.println("Isi list setelah add(Gita, -1) - seharusnya tidak berubah:");
    list.print();

    // TEST 11: add(item, index) - Invalid index (out of bounds high)
    // Karena tidak ada getSize(), sulit untuk menentukan "out of bounds high"
    // yang pasti. Mari kita coba indeks yang sangat besar.
    // Jika list hanya punya 6 elemen (Eko, Budi, Dina, Ani, Fina, Citra), index 1000 pasti out of
    // bounds.
    System.out.println("\n[TEST 11] Tambah Mahasiswa 'Hadi' pada indeks 1000 (invalid)");
    list.add(new Mahasiswa26("Hadi", "130", "IF-H", 3.10), 1000);
    System.out.println("Isi list setelah add(Hadi, 1000) - seharusnya tidak berubah:");
    list.print();

    // TEST 12: removeFirst
    System.out.println("\n[TEST 12] Hapus mahasiswa di awal");
    list.removeFirst();
    System.out.println("Isi list setelah removeFirst:");
    list.print();

    // TEST 13: removeLast
    System.out.println("\n[TEST 13] Hapus mahasiswa di akhir");
    list.removeLast();
    System.out.println("Isi list setelah removeLast:");
    list.print();

    // TEST 14: insertAfter
    System.out.println("\n[TEST 14] Tambahkan mahasiswa 'Indra' setelah NIM '126' (Dina)");
    // Pastikan Dina (126) masih ada di list setelah operasi remove di atas.
    // Jika tidak ada, test ini akan mencetak "Node dengan NIM 126 tidak ditemukan"
    list.insertAfter("126", new Mahasiswa26("Indra", "131", "IF-I", 3.77));
    System.out.println("Isi list setelah insertAfter (Indra setelah Dina):");
    list.print();

    // TEST 15: insertAfter - Key not found
    System.out.println("\n[TEST 15] Tambahkan mahasiswa 'Joko' setelah NIM '999' (tidak ada)");
    list.insertAfter("999", new Mahasiswa26("Joko", "132", "IF-J", 3.88));
    System.out.println("Isi list setelah insertAfter (NIM tidak ditemukan):");
    list.print();

    // Clear the list to test isEmpty after clear
    System.out.println("\n[TEST 16] Mengosongkan list secara manual (removeFirst sampai kosong)");
    while (!list.isEmpty()) {
      list.removeFirst();
    }
    System.out.println("List setelah dikosongkan:");
    list.print();

    // TEST 17: isEmpty - After clear
    System.out.println("\n[TEST 17] Cek apakah list kosong (setelah dikosongkan):");
    System.out.println("List kosong? " + (list.isEmpty() ? "Ya" : "Tidak"));
  }
}
