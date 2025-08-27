class AntrianTransaksi {
  NodeTransaksi head;
  NodeTransaksi tail;
  int maxSize;

  public int getSize() {
    NodeTransaksi temp = head;
    int size = 0;
    while (temp != null) {
      size++;
      temp = temp.next;
    }
    return size;
  }

  public AntrianTransaksi(int maxSize) {
    head = null;
    tail = null;
    this.maxSize = maxSize;
  }

  public boolean isEmpty() {
    return head == null;
  }

  public boolean isFull() {
    return getSize() == maxSize;
  }

  public void tambahTransaksi(TransaksiLayanan data) {
    if (isFull()) {
      System.out.println("Antrian Sudah Penuh");
      return;
    }
    NodeTransaksi temp = new NodeTransaksi(data, null);
    if (head == null) {
      head = temp;
      tail = temp;
    } else {
      tail.next = temp;
      tail = temp;
    }
  }

  public void tampilkanRiwayat() {
    if (isEmpty()) {
      System.out.println("Antrian Kosong");
    } else {
      System.out.println("Riwayat Transaksi Pasien");
      NodeTransaksi temp = head;
      while (temp != null) {
        System.out.println(
            temp.data.pasien.nama
                + "( "
                + temp.data.durasiLayanan
                + " Jam ) : Rp."
                + temp.data.hitungBiaya());
        temp = temp.next;
      }
    }
  }

  // UAS

  public TransaksiLayanan[] slice(int start, int end) {
    NodeTransaksi temp = head;
    int i = 0;
    int size = end - start;

    TransaksiLayanan[] res = new TransaksiLayanan[size];

    while (i < start) {
      temp = temp.next;
      i++;
    }

    int count = 0;
    while (count < size) {
      res[count] = temp.data;
      temp = temp.next;
      count++;
    }

    return res;
  }

  public void tampilSlice(TransaksiLayanan[] data) {
    for (int i = 0; i < data.length; i++) {
      System.out.println(
          data[i].pasien.nama
              + "( "
              + data[i].durasiLayanan
              + " Jam ) : Rp."
              + data[i].hitungBiaya());
    }
  }
}
