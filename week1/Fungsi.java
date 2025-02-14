public class Fungsi {

  public static int[] getRevenue(int[][] stock) {
    int priceList[] = {75000, 50000, 60000, 10000};
    int revenue[] = new int[stock.length];
    for (int i = 0; i < stock.length; i++) {
      for (int j = 0; j < stock[i].length; j++) {
        revenue[i] += stock[i][j] * priceList[j];
      }
    }
    return revenue;
  }

  public static void printRevenue(int[] revenue) {
    for (int i = 0; i < revenue.length; i++) {
      System.out.println("Pendapatan cabang ke-" + (i + 1) + ": " + revenue[i]);
    }
  }

  public static void updateStock(int[][] Stock, int storeBrach, int[] update) {
    for (int i = 0; i < Stock[storeBrach - 1].length; i++) {
      Stock[storeBrach - 1][i] += update[i];
    }
    System.out.println("Stok di cabang ke-" + storeBrach + " telah diubah.");
  }

  public static void printBranchStock(int[][] Stock, int storeBrach) {
    String flowersList[] = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    System.out.println("Persediaan di cabang ke-" + storeBrach);
    for (int i = 0; i < Stock[storeBrach - 1].length; i++) {
      System.out.println("Ketersediaan Bunga " + Stock[storeBrach - 1][i] + " " + flowersList[i]);
    }
  }

  public static void main(String[] args) {
    int[][] stock = {{10, 5, 15, 7}, {6, 9, 11, 12}, {2, 10, 10, 5}, {5, 7, 12, 9}};

    int[] revenue = getRevenue(stock);
    printRevenue(revenue);

    updateStock(stock, 4, new int[] {-1, -2, 0, -5});
    printBranchStock(stock, 4);
  }
}
