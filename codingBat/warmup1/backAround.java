public String backAround(String str) {
  char repeat = str.charAt(str.length() - 1);
  return repeat + str + repeat;
}
