public List<String> no34(List<String> strings) {
  strings.removeIf(str -> str.length() == 3 || str.length() == 4);
  return strings;
}
