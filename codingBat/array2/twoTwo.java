public boolean twoTwo(int[] nums) {
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 2) {
      boolean left = (i > 0 && nums[i - 1] == 2);
      boolean right = (i < nums.length - 1 && nums[i + 1] == 2);
      
      if (!left && !right) {
        return false;
      }
    }
  }
  return true;
}
