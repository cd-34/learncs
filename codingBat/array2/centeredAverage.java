public int centeredAverage(int[] nums) {
  // add up the entire array
  // remove the smallest and largest 
  // divide by array size
  int min = nums[0];
  int max = nums[0];
  int sum = nums[0];
  for (int i = 1; i < nums.length; i++) {
    min = Math.min(min, nums[i]);
    max = Math.max(max, nums[i]);
    sum = sum + nums[i];
  }
  return (sum - min - max) / (nums.length - 2);
}
