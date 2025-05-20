class SingleLinkedList26 {
  NodeMahasiswa26 head;
  NodeMahasiswa26 tail;

  public boolean isEmpty() {
    return head == null;
  }

  public void print() {
    if (!isEmpty()) {
      NodeMahasiswa26 temp = head;
      System.out.println("Isi Linked List:\t");
      while (temp != null) {
        temp.data.tampilInformasi();
        temp = temp.next;
      }
      System.out.println("");
    } else {
      System.out.println("Linked List kosong");
    }
  }

  public void addFirst(Mahasiswa26 data) {
    NodeMahasiswa26 ndInput = new NodeMahasiswa26(data, null);
    if (isEmpty()) {
      this.head = ndInput;
      this.tail = ndInput;
    } else {
      ndInput.next = head;
      head = ndInput;
    }
  }

  public void addLast(Mahasiswa26 data) {
    NodeMahasiswa26 ndInput = new NodeMahasiswa26(data, null);
    if (isEmpty()) {
      this.head = ndInput;
      this.tail = ndInput;
    } else {
      tail.next = ndInput;
      this.tail = ndInput;
    }
  }

  public void insertAfter(String key, Mahasiswa26 data) {
    NodeMahasiswa26 ndInput = new NodeMahasiswa26(data, null);
    NodeMahasiswa26 temp = head;
    do {
      if (temp.data.nama.equalsIgnoreCase(key)) {
        ndInput.next = temp.next;
        temp.next = ndInput;
        if (ndInput.next == null) {
          this.tail = ndInput;
        }
        break;
      }
      temp = temp.next;
    } while (temp != null);
  }

  public void insertAt(int index, Mahasiswa26 data) {
    if (index < 0) {
      System.out.println("Indeks salah.");
    } else if (index == 0) {
      addFirst(data);
    } else {
      NodeMahasiswa26 temp = head;
      for (int i = 0; i < index - 1; i++) {
        temp = temp.next;
      }
      temp.next = new NodeMahasiswa26(data, temp.next);
      if (temp.next.next == null) {
        this.tail = temp.next;
      }
    }
  }
}
