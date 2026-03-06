public String mixString(String a, String b) {
  int min = Math.min(a.length(), b.length());
  String result = "";
  for (int i = 0; i < min; i++) {
    result = result + a.charAt(i);
    result = result + b.charAt(i);
  }
  // a is longer
  if (a.length() > min) {
    result = result + a.substring(min);
  }
  // b is longer
  if (b.length() > min) {
    result = result + b.substring(min);
  }
  return result;
}
