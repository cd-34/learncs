public int scoresAverage(int[] scores) {
  int mid = scores.length / 2;
  int firstHalf = average(scores, 0, mid);
  int lastHalf = average(scores, mid, scores.length);
  return Math.max(firstHalf, lastHalf);
}

public int average(int[] scores, int start, int end) {
  int sum = 0;
  for (int i = start; i < end; i++) {
    sum += scores[i];
  }
  return sum / (scores.length / 2);
}