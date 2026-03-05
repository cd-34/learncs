public int[] makeLast(int[] nums) {
  int[] doubled = new int[nums.length * 2];
  doubled[doubled.length - 1] = nums[nums.length - 1];
  return doubled;
}
