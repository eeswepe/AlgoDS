public class DosenDemo26 {
  public static void main(String[] args) {
    DataDosen26 list = new DataDosen26();

    Dosen26 d1 = new Dosen26("D1", "Agus", true, 31);
    Dosen26 d2 = new Dosen26("D2", "Budi", true, 35);
    Dosen26 d3 = new Dosen26("D3", "Cici", false, 22);
    Dosen26 d4 = new Dosen26("D4", "Dedi", true, 45);
    Dosen26 d5 = new Dosen26("D5", "Eka", true, 32);
    Dosen26 d6 = new Dosen26("D6", "Feri", true, 38);
    Dosen26 d7 = new Dosen26("D7", "Gigi", false, 30);
    Dosen26 d8 = new Dosen26("D8", "Hana", false, 28);
    Dosen26 d9 = new Dosen26("D9", "Ika", false, 25);
    Dosen26 d10 = new Dosen26("D10", "Joni", true, 30);

    list.tambah(d1);
    list.tambah(d2);
    list.tambah(d3);
    list.tambah(d4);
    list.tambah(d5);
    list.tambah(d6);
    list.tambah(d7);
    list.tambah(d8);
    list.tambah(d9);
    list.tambah(d10);

    System.out.println("Data sebelum sorting:");
    list.tampil();

    System.out.println("Sorting ASC (termuda ke tertua):");
    list.sortingASC();
    list.tampil();

    System.out.println("Sorting DESC (tertua ke termuda):");
    list.sortingDESC();
    list.tampil();
  }
}
