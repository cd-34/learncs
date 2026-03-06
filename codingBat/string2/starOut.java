public String starOut(String str) {
  String result = "";
  for (int i = 0; i < str.length(); i++) {
    if ((i + 1) < str.length() && str.charAt(i + 1) == '*') {
      continue;
    }
    if (str.charAt(i) != '*') {
      result = result + str.charAt(i);
    }
    if (str.charAt(i) == '*') {
      i++;
    }
  }
  return result;
}
