public int[] post4(int[] nums) {
  int startingIndex = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 4) {
      startingIndex = i;
    }
  }
  int[] array = new int[nums.length - startingIndex - 1]; // length = 2
  for (int j = 0; j < array.length; j++) {
    array[j] = nums[startingIndex + 1 + j];
  }
  return array;
}