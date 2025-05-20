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

  public void getData(int index) {
    NodeMahasiswa26 tmp = head;
    for (int i = 0; i < index; i++) {
      tmp = tmp.next;
    }
    tmp.data.tampilInformasi();
  }

  public int indexOf(String key) {
    NodeMahasiswa26 tmp = head;
    int index = 0;
    while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
      tmp = tmp.next;
      index++;
    }
    if (tmp == null) {
      return -1;
    }
    return index;
  }

  public void removeFirst() {
    if (isEmpty()) {
      System.out.println("Linked list masih kosong, tidak dapat dihapus!");
    } else if (head == tail) {
      head = tail = null;
    } else {
      head = head.next;
    }
  }

  public void removeLast() {
    if (isEmpty()) {
      System.out.println("Linked list masih kosong, tidak dapat dihapus!");
    } else if (head == tail) {
      head = tail = null;
    } else {
      NodeMahasiswa26 temp = head;
      while (temp.next != tail) {
        temp = temp.next;
      }
      temp.next = null;
      tail = temp;
    }
  }

  public void remove(String key) {
    if (isEmpty()) {
      System.out.println("Linked list masih kosong, tidak dapat dihapus!");
    } else {
      NodeMahasiswa26 temp = head;
      while (temp != null) {
        if (temp.data.nama.equalsIgnoreCase(key) && (temp == head)) {
          removeFirst();
          break;
        } else if (temp.data.nama.equalsIgnoreCase(key)) {
          temp.next = temp.next.next;
          if (temp.next == null) {
            tail = temp;
          }
          break;
        }
        temp = temp.next;
      }
    }
  }

  public void removeAt(int index) {
    if (index == 0) {
      removeFirst();
    } else {
      NodeMahasiswa26 temp = head;
      for (int i = 0; i < index - 1; i++) {
        temp = temp.next;
      }
      temp.next = temp.next.next;
      if (temp.next == null) {
        tail = temp;
      }
    }
  }
}
