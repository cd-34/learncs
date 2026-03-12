public List<String> noZ(List<String> strings) {
  strings.removeIf(str -> str.contains("z"));
  return strings;
}
