public List<String> moreY(List<String> strings) {
  strings.replaceAll(str -> "y" + str + "y");
  return strings;
}
