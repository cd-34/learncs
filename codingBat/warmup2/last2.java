public int last2(String str) {
  if (str.length() < 2) {
    return 0;
  }
  
  String last2 = str.substring(str.length() - 2, str.length());
  int count = 0;
  
  for (int i = 0; i < str.length() - 2; i++) {
    if (str.substring(i, i + 2).equals(last2)) {
      count++;
    }
  }
  return count;
}
