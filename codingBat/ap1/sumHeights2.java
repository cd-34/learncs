public int sumHeights2(int[] heights, int start, int end) {
  int sum = 0;
  for (int i = start; i < end; i++) {
    if (heights[i + 1] - heights[i] > 0) {
      sum += (heights[i + 1] - heights[i]) * 2;
    } else {
      sum += Math.abs(heights[i + 1] - heights[i]);
    }
  }
  return sum;
}
