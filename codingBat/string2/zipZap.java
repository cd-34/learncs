public String zipZap(String str) {
  String result = "";
  if (str.length() <= 2) {
    return str;
  }
  for (int i = 0; i < str.length(); i++) {
    result += "" + str.charAt(i);
    // I feel like I should be getting an out of bounds error
    // For example "zzp" would have me access an index larger than the length of the string
    // But it pasts all tests I guess?
    if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
      i++;
    }
  }
  return result;
}
