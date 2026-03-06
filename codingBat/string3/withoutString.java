public String withoutString(String base, String remove) {
  String result = "";
  for (int i = 0; i < base.length(); i++) {
    if (i + remove.length() < base.length() + 1 && base.substring(i, i + remove.length()).toLowerCase().equals(remove.toLowerCase())) {
      // System.out.println(i);
      i = i + remove.length() - 1;
    } else {
      result = result + base.charAt(i);
    }
    
  }
  return result;
}

// System.out.println(withoutString("Hello there", "llo"));