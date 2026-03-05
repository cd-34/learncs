public String withoutX2(String str) {
  String result = str;
  if (str.length() >= 2 && str.charAt(1) == 'x') {
    result = "" + str.charAt(0) + str.substring(2);
  }
  if (result.length() > 0 && result.charAt(0) == 'x') {
    result = result.substring(1);
  } 
  return result;
}
