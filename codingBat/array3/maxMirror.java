public int maxMirror(int[] nums) {
  int mirror = 0;
  for (int i = 0; i < nums.length; i++) {
    for (int j = 0; j < nums.length; j++) {
      int current = 0;
      int indexi = i;
      int indexj = j;
      
      while (indexi < nums.length && indexj < nums.length && nums[indexi] == nums[nums.length - indexj - 1]) {
        current++;
        indexi++;
        indexj++;
      }
      mirror = Math.max(mirror, current);
    }
  }
  return mirror;
}
