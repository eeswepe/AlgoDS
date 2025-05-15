class AntrianKRS {
  Mahasiswa[] data;
  int front;
  int rear;
  int size;
  int max;
  int kuota = 30;

  public AntrianKRS() {
    max = 10;
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

  public void clear() {
    if (!isEmpty()) {
      front = rear = -1;
      size = 0;
      System.out.println("Queue berhasil dikosongkan.");
    } else {
      System.out.println("Queue masih kosong.");
    }
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

  public Mahasiswa[] layaniMahasiswa() {
    Mahasiswa[] dilayani = new Mahasiswa[2];
    if (isEmpty()) {
      System.out.println("Antrian kosong.");
      return null;
    }
    if (size < 2) {
      System.out.println("Masih kurang dari 2 Mahasiswa dalam Antrian.");
      return null;
    }
    dilayani[0] = data[front];
    dilayani[1] = data[front + 1];
    front = (front + 2) % max;
    size -= 2;
    kuota -= 2;
    return dilayani;
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

  public void lihatDuaTerdepan() {
    if (isEmpty()) {
      System.out.println("Antrian kosong.");
    } else {
      System.out.print("Mahasiswa terdepan: ");
      System.out.println("NIM - NAMA - PRODI - KELAS");
      data[front].tampilkanData();
      data[front + 1].tampilkanData();
    }
  }

  public void lihatTerakhir() {
    if (isEmpty()) {
      System.out.println("Antrian kosong.");
    } else {
      System.out.print("Mahasiswa terakhir: ");
      System.out.println("NIM - NAMA - PRODI - KELAS");
      data[rear].tampilkanData();
    }
  }

  public void getJumlahAntrian() {
    if (isEmpty()) {
      System.out.println("Antrian kosong.");
    } else {
      System.out.println("Jumlah Antrian = " + size);
    }
  }

  public void getMhsBelumProses() {
    System.out.println("Mahasiswa yang belum melakukan proses KRS: " + (kuota - size));
  }

  public void getMhsSudahProses() {
    System.out.println("Mahasiswa sudah melakukan proses KRS: " + (30 - kuota + size));
  }
}
