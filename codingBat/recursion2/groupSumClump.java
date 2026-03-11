public boolean groupSumClump(int start, int[] nums, int target) {
  if (start >= nums.length) {
    return target == 0;
  }
  
  if (start + 1 < nums.length && nums[start] == nums[start + 1]) {
    return groupSumClump(start + 2, nums, target) 
    || groupSumClump(start + 2, nums, target - (nums[start] * 2));
  }
  
  return groupSumClump(start + 1, nums, target) || groupSumClump(start + 1, nums, target - nums[start]);
}
