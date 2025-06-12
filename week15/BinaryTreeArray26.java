public class BinaryTreeArray26 {
  Student26[] data;
  int idxLast;

  public BinaryTreeArray26() {
    data = new Student26[10];
    idxLast = -1;
  }

  void add(Student26 data) {
    int i = 0;
    while (i < this.data.length && this.data[i] != null) {
      if (data.ipk < this.data[i].ipk) {
        i = 2 * i + 1;
      } else {
        i = 2 * i + 2;
      }
    }

    if (i >= this.data.length) {
      System.out.println(
          "\narray sudah penuh (atau tidak ada tempat kosong di jalur yang sesuai IPK)");
      return;
    }

    this.data[i] = data;
    this.idxLast++;
  }

  void populateData(Student26[] data, int idxLast) {
    this.data = data;
    this.idxLast = idxLast;
  }

  void traversePreOrder(int idxStart) {
    if (idxStart >= data.length) {
      return;
    }

    if (data[idxStart] != null) {
      data[idxStart].print();
      traversePreOrder(2 * idxStart + 1);
      traversePreOrder(2 * idxStart + 2);
    }
  }

  void traverseInOrder(int idxStart) {
    if (idxStart <= idxLast) {
      if (data[idxStart] != null) {
        traverseInOrder(2 * idxStart + 1);
        data[idxStart].print();
        traverseInOrder(2 * idxStart + 2);
      }
    }
  }
}
