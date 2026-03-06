public String repeatFront(String str, int n) {
  String repeat = str.substring(0, n);
  String result = "";
  for (int i = 0; i < n; i++) {
    repeat = str.substring(0, n - i);
    result += repeat;
  }
  return result;
}
