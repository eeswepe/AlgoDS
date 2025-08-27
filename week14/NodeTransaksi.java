class NodeTransaksi {
  TransaksiLayanan data;
  NodeTransaksi next;

  public NodeTransaksi() {}

  public NodeTransaksi(TransaksiLayanan data, NodeTransaksi next) {
    this.data = data;
    this.next = next;
  }
}
