public int[] squareUp(int n) {
  int[] array = new int[n * n];
  int index = 0;
  
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
      int distance = n - j - 1;
      // System.out.println("distance: " + distance + " | i: " + i + " | j: " + j);
      if (distance <= i) {
        array[index] = distance + 1;
        index++;
      } else {
        array[index] = 0;
        index++;
      }
    }
  }
  
  return array;
}

// System.out.println(squareUp(3));
// squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]