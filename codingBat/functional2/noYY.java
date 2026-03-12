public List<String> noYY(List<String> strings) {
  return strings.stream()
    .map(str -> str + "y")
    .filter(str -> !str.contains("yy"))
    .collect(Collectors.toList());
}
