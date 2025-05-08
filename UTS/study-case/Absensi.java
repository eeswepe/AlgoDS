public class Absensi{
    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    int hadir, sakit, izin, alpa;

    Absensi(Mahasiswa mahasiswa, MataKuliah mataKuliah, int hadir, int sakit, int izin, int alpa){
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.hadir = hadir;
        this.sakit = sakit;
        this.izin = izin;
        this.alpa = alpa;
    }

    public double hitungPersentaseKehadiran(){
        double persentase = ((double) hadir / (hadir + sakit + izin + alpa)) * 100;
        // if(hadir < 10){
        //     persentase = ((double) hadir/ (hadir+sakit+izin+ (2*alpa)))*100;
        // }else{
        //     if(alpa != 0){
        //         persentase = ((double) hadir / (hadir + 2*(sakit + izin) + alpa)) * 100;        
        //     }
        //     else{
        //         persentase = ((double) hadir / (hadir + sakit + izin + alpa)) * 100;       
        //     }
        // }
        return persentase;
    }

    public void tampilData(){
        System.out.println("NIM: " + mahasiswa.nim + " | Nama: " + mahasiswa.namaMahasiswa);
        System.out.println("Mata Kuliah: " + mataKuliah.namaMK);
        System.out.println("Hadir: " + hadir + " | Sakit: " + sakit + " | Izin: " + izin + " | Alpa: " + alpa);
        System.out.printf("Persentase Kehadiran: %.2f%%\n", hitungPersentaseKehadiran());
        System.out.println();
    }
}