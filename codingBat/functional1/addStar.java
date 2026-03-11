public List<String> addStar(List<String> strings) {
  strings.replaceAll(str -> str + "*");
  return strings;
}
