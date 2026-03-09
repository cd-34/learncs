public int[] pre4(int[] nums) {
  int arraySize = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] != 4) {
      arraySize++;
    } else {
      break;
    }
  }
  int[] array = new int[arraySize];
  for (int j = 0; j < array.length; j++) {
    array[j] = nums[j];
  }
  return array; 
}
