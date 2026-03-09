public int[] shiftLeft(int[] nums) {
  int[] array = new int[nums.length];
  for (int i = 0; i < array.length; i++) {
    array[i] = nums[(i + 1) % nums.length];
  }
  return array;
}
