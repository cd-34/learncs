public boolean split53(int[] nums) {
  return split53(0, nums, 0, 0);
}

public boolean split53(int start, int[] nums, int sum1, int sum2) {
  if (start >= nums.length) {
    return sum1 == sum2;
  }
  
  if (nums[start] % 5 == 0) {
    return split53(start + 1, nums, sum1 + nums[start], sum2);
  }
  if (nums[start] % 3 == 0) {
    return split53(start + 1, nums, sum1, sum2 + nums[start]);
  }
  return split53(start + 1, nums, sum1, sum2 + nums[start]) || split53(start + 1, nums, sum1 + nums[start], sum2);
}
