public int sumNumbers(String str) {
  int sum = 0;
  String current = "";
  for (int i = 0; i < str.length(); i++) {
    if (Character.isDigit(str.charAt(i))) {
      current += str.charAt(i);
    } else {
      if (current.length() > 0) {
        sum+= Integer.parseInt(current);
        current = "";
      } 
    }
  }
  if (current.length() > 0) {
    sum += Integer.parseInt(current);
  }
  return sum;
}
