class StackTugasMahasiswa26 {
  Mahasiswa26[] stack;
  int size;
  int top;

  public StackTugasMahasiswa26(int size) {
    this.size = size;
    stack = new Mahasiswa26[size];
    top = -1;
  }

  public boolean isFull() {
    return top == size - 1;
  }

  public boolean isEmpty() {
    return top == -1;
  }

  public void push(Mahasiswa26 data) {
    if (!isFull()) {
      top++;
      stack[top] = data;
    } else {
      System.out.println("Stack penuh! Tidak dapat menambahkan tugas lagi.");
    }
  }

  public Mahasiswa26 pop() {
    if (!isEmpty()) {
      Mahasiswa26 m = stack[top];
      top--;
      return m;
    } else {
      System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
      return null;
    }
  }

  public Mahasiswa26 lihatTerbawah() {
    if (!isEmpty()) {
      return stack[0];
    } else {
      System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
      return null;
    }
  }

  public Mahasiswa26 peek() {
    if (!isEmpty()) {
      return stack[top];
    } else {
      System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
      return null;
    }
  }

  public void print() {
    for (int i = 0; i <= top; i++) {
      System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
    }
    System.out.println();
  }

  public void jumlahTugas() {
    if (isEmpty()) {
      System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
    } else {
      System.out.println("Jumlah Tugas yang Sudah Dikumpulkan: " + (top + 1));
    }
  }

  public String konversiDesimalKeBiner(int nilai) {
    StackKonversi26 stack = new StackKonversi26();
    while (nilai > 0) {
      int sisa = nilai % 2;
      stack.push(sisa);
      nilai /= 2;
    }
    String biner = new String();
    while (!stack.isEmpty()) {
      biner += stack.pop();
    }
    return biner;
  }
}
