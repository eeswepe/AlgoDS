public class SmartHomeMain {
  public static void main(String[] args) {
    int arrayLength = 5;
    SmartHomeDevice arrayOfDevice[] = new SmartHomeDevice[arrayLength];

    arrayOfDevice[0] = new SmartHomeDevice("Televisi", 14.00, 12.00);
    arrayOfDevice[1] = new SmartHomeDevice("Lemari Es", 25.00, 23.50);
    arrayOfDevice[2] = new SmartHomeDevice("Kipas Angin", 4.00, 1.50);
    arrayOfDevice[3] = new SmartHomeDevice("Mesin Cuci", 24.00, 14.50);
    arrayOfDevice[4] = new SmartHomeDevice("Komputer", 18.00, 13.70);

    // paling efisien
    int idx_efisien = 0;
    for (int i = 1; i < arrayOfDevice.length; i++) {
      if (arrayOfDevice[i].rasioEfisiensi() > arrayOfDevice[idx_efisien].rasioEfisiensi()) {
        idx_efisien = i;
      }
    }
    System.out.println(
        "Device paling efisien adalah "
            + arrayOfDevice[idx_efisien].nama
            + "\nDengan rincian device sebagai berikut:");
    arrayOfDevice[idx_efisien].printData();
    System.out.println("===========================================");

    // rata rata total energi aktual
    double sum = 0;
    int counter = 0;
    for (int i = 0; i < arrayOfDevice.length; i++) {
      if (arrayOfDevice[i].konsumsiPower > 10) {
        sum += arrayOfDevice[i].totalEnergiAktif();
        counter++;
      }
    }
    double average = sum / counter;
    System.out.printf(
        "Rata rata total energi aktual dari device dengan konsumsi power > 10 adalah %.2f Watt",
        average);
  }
}
