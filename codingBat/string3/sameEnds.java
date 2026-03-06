public String sameEnds(String str) {
  int maxLen = str.length() / 2;
  for (int len = maxLen; len > 0; len--) {
      String start = str.substring(0, len);
      String end = str.substring(str.length() - len);
      if (start.equals(end)) {
          return start;
      }
  }
  return "";
}