public String wordAppend(String[] strings) {
  String result = "";
  Map<String, Integer> map = new HashMap<>();
  for (String s:strings) {
    map.put(s, map.getOrDefault(s, 0) + 1);
    
    int count = map.get(s);
    if (count % 2 == 0) {
      result += s;
    }
  }

  return result;
}
