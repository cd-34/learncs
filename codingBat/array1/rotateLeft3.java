public int[] rotateLeft3(int[] nums) {
  int[] rotated = new int[3];
  for (int i = 0; i < nums.length; i++) {
    rotated[i] = nums[(i + 1) % 3];
  }
  return rotated;
}
