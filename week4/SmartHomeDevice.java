public class SmartHomeDevice {
  public String nama;
  public double konsumsiPower;
  public double standbyPower;

  public SmartHomeDevice(String nama, double konsumsiPower, double standbyPower) {
    this.nama = nama;
    this.konsumsiPower = konsumsiPower;
    this.standbyPower = standbyPower;
  }

  public double totalEnergiAktif() {
    return this.konsumsiPower + this.standbyPower;
  }

  public double rasioEfisiensi() {
    return this.standbyPower / this.totalEnergiAktif();
  }

  public void printData() {
    System.out.println("Nama               : " + this.nama);
    System.out.println("Konsumsi Power     : " + this.konsumsiPower);
    System.out.println("Standby Power      : " + this.standbyPower);
    System.out.println("Total Energi Aktif : " + this.totalEnergiAktif());
    System.out.printf("Rasio Efisiensi    : %.2f%%\n", (this.rasioEfisiensi() * 100));
  }
}
