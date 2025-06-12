class Student26 {
  String nim;
  String name;
  String className;
  double ipk;

  public Student26() {}

  public Student26(String nim, String name, String className, double ipk) {
    this.nim = nim;
    this.name = name;
    this.className = className;
    this.ipk = ipk;
  }

  void print() {
    System.out.println(nim + " - " + name + " - " + className + " - " + ipk);
  }
}
