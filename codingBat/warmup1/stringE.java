public boolean stringE(String str) {
  int count = 0;
  for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) == 'e') {
      count++;
    }
  }
  return (count > 0 && count <= 3);
}
