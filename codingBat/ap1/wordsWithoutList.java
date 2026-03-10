public List wordsWithoutList(String[] words, int len) {
  List<String> list = new ArrayList<>();
  for (int i = 0; i < words.length; i++) {
    if (words[i].length() != len) {
      list.add(words[i]);
    }
  }
  return list;
}
