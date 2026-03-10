public int[] copyEvens(int[] nums, int count) {
  int index = 0;
  int[] array = new int[count];
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] % 2 == 0 && index < count) {
      array[index] = nums[i];
      index++;
    }
  }
  return array;
}
