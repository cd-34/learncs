public boolean canBalance(int[] nums) {
  for (int i = 0; i < nums.length; i++) {
    int left = 0;
    int right = 0;
    for (int j = 0; j <= i; j++) {
      left += nums[j];
    }
    for (int k = i + 1; k < nums.length; k++) {
      right += nums[k];
    }
    // System.out.println(left + "<left right>" + right);
    if (left == right) {
      return true;
    }
  }
  return false;
}

// System.out.println(canBalance(new int[]{1, 1, 1, 2, 1}));
// System.out.println(canBalance(new int[]{10, 10}));