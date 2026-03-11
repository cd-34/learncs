public String[] firstSwap(String[] strings) {
  Map<Character, Integer> map = new HashMap<>();
  
  for (int i = 0; i < strings.length; i++) {
    char current = strings[i].charAt(0);
    if (map.containsKey(current)) {
      if (map.get(current) == -1) {
        continue;
      }
      String temp = strings[i];
      strings[i] = strings[map.get(current)];
      strings[map.get(current)] = temp;
      map.put(current, -1);
    } else {
      map.put(current, i);
    }
  }
  return strings;
}
