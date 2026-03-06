public int maxBlock(String str) {
  if (str.length() == 0) {
    return 0;
  }
  int currentSize = 1;
  int maxSize = 1;
  
  for (int i = 0; i < str.length() - 1; i++) {
    if (str.charAt(i) == str.charAt(i + 1)) {
      currentSize++;
      maxSize = Math.max(maxSize, currentSize);
    } else {
      currentSize = 1;
    }
  }
  return maxSize;
}
