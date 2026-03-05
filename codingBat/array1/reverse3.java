public int[] reverse3(int[] nums) {
  int[] reversed = new int[3];
  for (int i = 0; i < nums.length; i++) {
    reversed[i] = nums[2 - i];
  }
  return reversed;
}
