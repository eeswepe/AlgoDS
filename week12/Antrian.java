class Antrian {
  NodeMhs head;
  NodeMhs tail;
  int size;
  int currentSize;

  public Antrian(int size) {
    head = null;
    tail = null;
    this.size = size;
    this.currentSize = 0;
  }

  public boolean isEmpty() {
    return head == null;
  }

  public boolean isFull() {
    return currentSize == size;
  }

  public int getCurrentSize() {
    return currentSize;
  }

  public void clear() {
    head = null;
    tail = null;
    currentSize = 0;
    System.out.println("Antrian Telah Dikosongkan");
  }

  public void print() {
    if (isEmpty()) {
      System.out.println("Antrian Kosong");
      return;
    }
    NodeMhs temp = head;
    System.out.println("Mahasiswa Mengantri : ");
    while (temp != null) {
      temp.data.tampilInformasi();
      temp = temp.next;
    }
  }

  public void insert(MhsAntri data) {
    if (isFull()) {
      System.out.println("Antrian Sudah Penuh");
      return;
    }
    NodeMhs temp = new NodeMhs(data, null);
    if (head == null) {
      head = temp;
      tail = temp;
    } else {
      tail.next = temp;
      tail = temp;
    }
    currentSize++;
  }

  public void pop() {
    if (isEmpty()) {
      System.out.println("Antrian Masih Kosong");
    } else {
      System.out.println("Memproses 1 Antrian Mahasiswa");
      head.data.tampilInformasi();
      head = head.next;
      currentSize--;
    }
  }

  public void tampilTerdepan() {
    if (isEmpty()) {
      System.out.println("Antrian Masih Kosong");
    } else {
      System.out.println("Mahasiswa Terdepan : ");
      head.data.tampilInformasi();
    }
  }

  public void tampilTerakhir() {
    if (isEmpty()) {
      System.out.println("Antrian Masih Kosong");
    } else {
      System.out.println("Mahasiswa Terakhir : ");
      tail.data.tampilInformasi();
    }
  }
}
