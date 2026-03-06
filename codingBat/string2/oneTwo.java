public String oneTwo(String str) {
  String result = "";
  for (int i = 0; i < (str.length() - 2); i = i + 3) {
    result += "" + str.charAt(i + 1) + str.charAt(i + 2) + str.charAt(i);
  }
  return result;
}
