public class Sum {
  double keuntungan[];

  public Sum(int el) {
    keuntungan = new double[el];
  }

  public double totalBF() {
    double total = 0;
    for (int i = 0; i < keuntungan.length; i++) {
      total += keuntungan[i];
    }
    return total;
  }

  public double totalDC(double arr[], int l, int r) {
    if (l == r) {
      return arr[l];
    } else {
      int mid = (l + r) / 2;
      double lsum = totalDC(arr, l, mid);
      double rsum = totalDC(arr, mid + 1, r);
      return lsum + rsum;
    }
  }
}
