public String stringX(String str) {
  if (str.length() <= 2) {
    return str;
  }
  String result = "" + str.charAt(0);
  for (int i = 1; i < str.length() - 1; i++) {
    if (str.charAt(i) != 'x') {
      result += str.charAt(i);  
    }
  }
  result += str.charAt(str.length() - 1);
  return result;
}
