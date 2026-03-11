public String[] allSwap(String[] strings) {
  
  Map<String, Integer> map = new HashMap<>();
  for (int i = 0; i < strings.length; i++) {
    if (map.containsKey(strings[i].substring(0, 1))) {
      int swap = map.get(strings[i].substring(0, 1));
      String temp = strings[i];
      strings[i] = strings[swap];
      strings[swap] = temp;
      map.remove(strings[i].substring(0, 1));
    } else {
      map.put(strings[i].substring(0, 1), i);
    }
  }
  return strings;
}
