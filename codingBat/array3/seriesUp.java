// seriesUp(3) → [1, 1, 2, 1, 2, 3]
// i <= n means 1, 2, 3
// j <= i means 1, then 12, then 123

public int[] seriesUp(int n) {
  int[] array = new int[n*(n+1)/2];
  int index = 0;
  for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
      array[index] = j;
      index++;
    }
  }
  return array;
}
