public boolean splitArray(int[] nums) {
  return splitArray(0, nums, 0, 0);
}

public boolean splitArray(int start, int[] nums, int sum1, int sum2) {
  if (start >= nums.length) {
    return sum1 == sum2;
  }
  
  return splitArray(start + 1, nums, sum1 + nums[start], sum2) 
    || splitArray(start + 1, nums, sum1, sum2 + nums[start]);
}