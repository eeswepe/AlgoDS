public class MataKuliah {
    String kodeMK;
    String namaMK;
    int sks;

    public MataKuliah(String kdMK, String nmMK, int sks1){
        this.kodeMK = kdMK;
        this.namaMK = nmMK;
        this.sks = sks1;
    }
    void tampilData(){
        System.out.printf("%-10s %-6s %-3s %-7s %-26s %-3s %-6s %-4s%n","Kode MK : ",kodeMK + " ","| ",
        "Nama : ", namaMK + " ","| ","SKS : ",sks + " ");
    }
    
}