class StackSurat26 {
  Surat26[] stack;
  int top, size;

  public StackSurat26(int size) {
    this.size = size;
    stack = new Surat26[size];
    top = -1;
  }

  public boolean isEmpty() {
    return top == -1;
  }

  public boolean isFull() {
    return top == size - 1;
  }

  public void push(Surat26 surat) {
    if (!isFull()) {
      stack[++top] = surat;
    } else {
      System.out.println("Stack full! Tidak bisa menyimpan surat.");
    }
  }

  public Surat26 pop() {
    if (!isEmpty()) {
      return stack[top--];
    } else {
      System.out.println("Stack kosong! Tidak ada surat yang dikumpulkan.");
      return null;
    }
  }

  public Surat26 peek() {
    if (!isEmpty()) {
      return stack[top];
    } else {
      System.out.println("Stack kosong! Tidak ada surat yang dikumpulkan.");
      return null;
    }
  }

  public void cariSurat(String cari) {
    if (isEmpty()) {
      System.out.println("Stack kosong! Tidak ada surat yang dikumpulkan.");
      return;
    } else {
      boolean found = false;
      for (int i = 0; i <= top; i++) {
        if (stack[i].namaMahasiswa.equalsIgnoreCase(cari)) {
          System.out.println(
              "--------------------------------------------------------------------------------");
          System.out.println("Surat yang ditemukan: " + stack[i].namaMahasiswa);
          stack[i].cetakSurat();
          found = true;
        }
      }
      if (!found) {
        System.out.printf("Surat dengan nama %s tidak ditemukan.", cari);
      }
    }
  }
}
