public int maxTriple(int[] nums) {
  int max = Math.max(nums[0], nums[nums.length / 2]);
  return Math.max(max, nums[nums.length - 1]);
}
