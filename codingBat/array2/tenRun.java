public int[] tenRun(int[] nums) {
  int[] array = new int[nums.length];
  boolean bool = false;
  int multiple = 0;
  for (int i = 0; i < nums.length; i++) {
    if (bool == false && nums[i] % 10 != 0) {
      array[i] = nums[i];
    }
    if (nums[i] % 10 == 0) {
      bool = true;
      multiple = nums[i];
      array[i] = multiple;
    }
    if (bool == true) {
      array[i] = multiple;
    }
  }
  return array;
}
