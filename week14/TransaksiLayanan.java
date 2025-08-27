class TransaksiLayanan {

    Pasien pasien;
    Dokter dokter;

    int durasiLayanan;
    int biaya;

    public TransaksiLayanan(Pasien pasien, Dokter dokter, int durasiLayanan) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.durasiLayanan = durasiLayanan;
        this.biaya = 50000;
    }

    public int hitungBiaya() {
        return biaya * durasiLayanan;
    }
}
