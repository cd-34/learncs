public int[] makeMiddle(int[] nums) {
  int half = nums.length / 2;
  return new int[]{nums[half - 1], nums[half]};
}
