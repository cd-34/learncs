public boolean splitOdd10(int[] nums) {
  return splitOdd10(0, nums, 0, 0);
}

public boolean splitOdd10(int start, int[] nums, int sum1, int sum2) {
  if (start >= nums.length) {
    return (sum1 % 10 == 0 && sum2 % 2 != 0);
  }
  
  return splitOdd10(start + 1, nums, sum1 + nums[start], sum2) 
    || splitOdd10(start + 1, nums, sum1, sum2 + nums[start]);
}