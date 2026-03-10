public int maxSpan(int[] nums) {
  if (nums.length == 0) {
    return 0;
  }
  int max = 1;
  for (int i = 0; i < nums.length; i++) {
    // now 1
    int val = nums[i]; 
    for (int j = i + 1; j < nums.length; j++) {
      if (nums[j] == val) {
        max = Math.max(max, j - i + 1);
      }
    }
  }
  return max;
}
