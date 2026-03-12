public List<String> noLong(List<String> strings) {
  strings.removeIf(str -> str.length() >= 4);
  return strings;
}
