public int countYZ(String str) {
  int count = 0;
  for (int i = 1; i < str.length(); i++) {
    if (!Character.isLetter(str.charAt(i))) {
      if (Character.toLowerCase(str.charAt(i - 1)) == 'y' || Character.toLowerCase(str.charAt(i - 1)) == 'z') {
        count++;
      }
    }
  }
  if (Character.toLowerCase(str.charAt(str.length() - 1)) == 'y' || Character.toLowerCase(str.charAt(str.length() - 1)) == 'z') {
    count++;
  }
  return count;
}
