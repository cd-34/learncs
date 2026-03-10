// special = n % 10 == 0;
public int scoresSpecial(int[] a, int[] b) {
  return maxSpecial(a) + maxSpecial(b);
}

public int maxSpecial(int[] array) {
  int max = 0;
  for (int i = 0; i < array.length; i++) {
    if (array[i] % 10 == 0) {
      max = Math.max(max, array[i]);
    }
  }
  return max;
}