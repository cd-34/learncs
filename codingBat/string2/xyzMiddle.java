public boolean xyzMiddle(String str) {
  int len = str.length();
  for (int i = 0; i < len - 2; i++) {
    if (str.substring(i, i + 3).equals("xyz")) {
      int leftCount = i;
      int rightCount = len - (i + 3);
      if (Math.abs(leftCount - rightCount) <= 1) {
        return true;
      }
    }
  }
  return false;
}
