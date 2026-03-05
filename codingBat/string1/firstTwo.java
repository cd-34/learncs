public String firstTwo(String str) {
  if (str.length() < 2) {
    return str;
  } else {
    String front = str.substring(0, 2);
    return front;
  }
}
