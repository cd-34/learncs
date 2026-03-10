public int[] fix45(int[] nums) {
  int[] array = new int[nums.length];
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 4) {
      array[i] = 4;
      array[i + 1] = 5; 
    }
  }
  for (int i = 0; i < nums.length; i++) {
    if (array[i] == 0) {
      for (int j = 0; j < nums.length; j++) {
        if (nums[j] != 4 && nums[j] != 5) {
          array[i] = nums[j];
        }
      }
    }
  }
  return array;
}
