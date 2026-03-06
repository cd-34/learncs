public boolean equalIsNot(String str) {
  int is = 0;
  int not = 0;
  for (int i = 0; i < str.length(); i++) {
    if (i < str.length() - 1 && str.substring(i, i + 2).equals("is")) {
      is++;
    }
    if (i < str.length() - 2 && str.substring(i, i + 3).equals("not")) {
      not++;
    }
  }
  return is == not;
}
