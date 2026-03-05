public String atFirst(String str) {
  if (str.length() == 0) {
    return "@@";
  } else if (str.length() == 1) {
    return "" + str.charAt(0) + "@";
  } else {
    return str.substring(0, 2);
  }
}
