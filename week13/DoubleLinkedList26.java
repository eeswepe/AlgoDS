public class DoubleLinkedList26 {
  Node26 head;
  Node26 tail;

  public DoubleLinkedList26() {
    this.head = null;
    this.tail = null;
  }

  public int getSize() {
    Node26 current = head;
    int size = 0;
    while (current != null) {
      current = current.next;
      size++;
    }
    return size;
  }

  public boolean isEmpty() {
    return head == null;
  }

  public void add(Mahasiswa26 item, int index) {
    if (index < 0 || index > getSize()) {
      System.out.println("Indeks tidak valid");
      return;
    }

    if (index == 0) {
      addFirst(item);
      return;
    }

    if (index == getSize()) {
      addLast(item);
      return;
    }

    Node26 current = head;
    int i = 1;
    while (current != null && i < index) {
      current = current.next;
      i++;
    }

    if (current == null) {
      System.out.println("Indeks tidak ditemukan");
      return;
    }

    Node26 newNode = new Node26(item);

    newNode.prev = current.prev;
    newNode.next = current;

    if (current.prev != null) {
      current.prev.next = newNode;
    }

    current.prev = newNode;

    if (current == head) {
      head = newNode;
    }
  }

  public void addFirst(Mahasiswa26 data) {
    Node26 newNode = new Node26(data);
    if (isEmpty()) {
      head = tail = newNode;
    } else {
      newNode.next = head;
      head.prev = newNode;
      head = newNode;
    }
  }

  public void addLast(Mahasiswa26 data) {
    Node26 newNode = new Node26(data);
    if (isEmpty()) {
      head = tail = newNode;
    } else {
      newNode.prev = tail;
      tail.next = newNode;
      tail = newNode;
    }
  }

  public void removeFirst() {
    if (isEmpty()) {
      System.out.println("List kosong");
      return;
    }
    if (head == tail) {
      head = tail = null;
      System.out.println("Data yang dihapus: " + head.data.tampil());
      return;
    } else {
      head = head.next;
      head.prev = null;
      System.out.println("Data yang dihapus: " + head.data.tampil());
    }
  }

  public void removeLast() {
    if (isEmpty()) {
      System.out.println("List kosong");
      return;
    }
    if (head == tail) {
      head = tail = null;
      System.out.println("Data yang dihapus: " + tail.data.tampil());
      return;
    } else {
      tail = tail.prev;
      tail.next = null;
      System.out.println("Data yang dihapus: " + tail.data.tampil());
    }
  }

  public void insertAfter(String keyNIM, Mahasiswa26 data) {
    Node26 current = head;

    while (current != null && !current.data.nim.equals(keyNIM)) {
      current = current.next;
    }

    if (current == null) {
      System.out.println("Node dengan NIM " + keyNIM + " tidak ditemukan");
      return;
    }

    Node26 newNode = new Node26(data);

    if (current == tail) {
      newNode.prev = current;
      current.next = newNode;
      current = newNode;
    } else {
      newNode.next = current.next;
      newNode.prev = current;
      current.next.prev = newNode;
      current.next = newNode;
    }

    System.out.println("Node berhasil disimpan setelah NIM " + keyNIM);
  }

  public Node26 search(String keyNIM) {
    Node26 current = head;
    while (current != null && !current.data.nim.equals(keyNIM)) {
      current = current.next;
    }
    return current;
  }

  public void print() {
    if (isEmpty()) {
      System.out.println("List kosong");
      return;
    }
    Node26 current = head;
    while (current != null) {
      current.data.tampil();
      current = current.next;
    }
  }
}
