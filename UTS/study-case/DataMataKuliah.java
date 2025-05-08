public class DataMataKuliah {
    MataKuliah arrayOfMataKuliah[] = new MataKuliah[3];

    public DataMataKuliah(MataKuliah[] arrayOfMataKuliah){
        this.arrayOfMataKuliah = arrayOfMataKuliah;
    }
    public void tampilMatakuliah(){
        System.out.println("=== DATA MATA KULIAH ===");
        for(int i = 0; i < 3; i++){
            arrayOfMataKuliah[i].tampilData();
        }
    }
}
