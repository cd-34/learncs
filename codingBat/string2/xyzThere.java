// can iterate through the string like I normally do
// need to avoid out of bounds to find the period

public boolean xyzThere(String str) {
  for (int i = 0; i < str.length() - 2; i++) {
    if (str.substring(i, i + 3).equals("xyz")) {
      if ((i - 1) < 0 || (i - 1) >= 0 && str.charAt(i - 1) != '.') {
        return true;
      }
    }
  }
  return false;
}
