public int countClumps(int[] nums) {
  int clumps = 0;
  boolean bool = false;
  for (int i = 1; i < nums.length; i++) {
    if (nums[i] == nums[i - 1]) {
      if (!bool) {
        clumps++;
        bool = true;
      }
    } else {
      bool = false;
    }
  }
  return clumps;
}