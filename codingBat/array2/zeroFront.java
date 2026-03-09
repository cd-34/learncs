public int[] zeroFront(int[] nums) {
  int[] array = new int[nums.length];
  int index = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 0) {
      // arrays are initialized to 0 so don't need this line
      // array[i] = 0;
      index++;
    }
  }
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] != 0) {
      array[index] = nums[i];
      index++;
    }
  }
  return array;
}
