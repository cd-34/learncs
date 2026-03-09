public int[] zeroMax(int[] nums) {
  for (int i = 0; i < nums.length - 1; i++) {
    if (nums[i] == 0) {
      int max = 0;
      for (int j = i; j < nums.length; j++) {
        if (nums[j] % 2 != 0) {
          max = Math.max(nums[j], max);
          nums[i] = max;
        }
      }
    }
  }
  return nums;
}
