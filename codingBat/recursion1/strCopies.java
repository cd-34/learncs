public boolean strCopies(String str, String sub, int n) {
  return (count(str, sub) >= n);
}

public int count(String str, String sub) {
  if (str.length() <= sub.length() - 1) {
    return 0;
  }
  
  if (str.substring(0, sub.length()).equals(sub)) {
    return 1 + count(str.substring(1), sub);
  }
  return count(str.substring(1), sub);
}