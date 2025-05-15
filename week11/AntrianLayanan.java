public class AntrianLayanan {

  Mahasiswa[] data;
  int front;
  int rear;
  int size;
  int max;

  public AntrianLayanan(int n) {
    max = n;
    data = new Mahasiswa[max];
    front = size = 0;
    rear = -1;
  }

  public boolean isFull() {
    return size == max;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void tambahAntrian(Mahasiswa mhs) {
    if (isFull()) {
      System.out.println("Antrian sudah penuh, tidak dapat menambahkan Mahasiswa");
      return;
    }
    rear = (rear + 1) % max;
    data[rear] = mhs;
    size++;
    System.out.println(mhs.nama + " berhasil masuk ke antrian.");
  }

  public Mahasiswa layaniMahasiswa() {
    if (isEmpty()) {
      System.out.println("Antrian kosong.");
      return null;
    }
    Mahasiswa mhs = data[front];
    front = (front + 1) % max;
    size--;
    return mhs;
  }

  public void lihatTerdepan() {
    if (isEmpty()) {
      System.out.println("Antrian kosong.");
    } else {
      System.out.print("Mahasiswa terdepan: ");
      System.out.println("NIM - NAMA - PRODI - KELAS");
      data[front].tampilkanData();
    }
  }

  public void lihatAkhir() {
    if (isEmpty()) {
      System.out.println("Antrian kosong.");
    } else {
      System.out.print("Mahasiswa terakhir: ");
      System.out.println("NIM - NAMA - PRODI - KELAS");
      data[rear].tampilkanData();
    }
  }

  public void tampilkanSemua() {
    if (isEmpty()) {
      System.out.println("Antrian kosong.");
      return;
    }
    System.out.println("Daftar Mahasiswa dalam Antrian");
    System.out.println("NIM - NAMA - PRODI - KELAS");
    for (int i = 0; i < size; i++) {
      int index = (front + i) % max;
      System.out.print((i + 1) + ". ");
      data[index].tampilkanData();
    }
  }

  public int getJumlahAntrian() {
    return size;
  }

  public void clear() {
    if (!isEmpty()) {
      front = rear = -1;
      size = 0;
      System.out.println("Queue berhasil dikosongkan.");
    } else {
      System.out.println("Queue masih kosong.");
    }
  }
}
