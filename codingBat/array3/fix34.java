public int[] fix34(int[] nums) {
  int[] array = new int[nums.length];
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 3) {
      array[i] = 3;
      array[i + 1] = 4; 
    }
  }
  for (int i = 0; i < nums.length; i++) {
    if (array[i] == 0) {
      for (int j = 0; j < nums.length; j++) {
        if (nums[j] != 3 && nums[j] != 4) {
          array[i] = nums[j];
        }
      }
    }
  }
  return array;
}
