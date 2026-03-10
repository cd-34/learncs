// endy = 0 - 10 || 90 - 100
public int[] copyEndy(int[] nums, int count) {
  int[] array = new int[count];
  int index = 0;
  for (int i = 0; i < nums.length; i++) {
    if (isEndy(nums[i]) && index < count) {
      array[index] = nums[i];
      index++;
    }
  }
  return array;
}

public boolean isEndy(int n) {
  return ((n >= 0 && n <= 10) || (n >= 90 && n <= 100));
  
}
