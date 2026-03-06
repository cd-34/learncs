public String notReplace(String str) {
  String result = "";
  for (int i = 0; i < str.length(); i++) {
    if (i <= str.length() - 2 && str.substring(i, i + 2).equals("is")) {
      boolean hasLetterBefore = (i > 0 && Character.isLetter(str.charAt(i - 1)));
      boolean hasLetterAfter = (i + 2 < str.length() && Character.isLetter(str.charAt(i + 2)));
      
      if (!hasLetterBefore && !hasLetterAfter) {
          result += "is not";
          i++;
      } else {
          result += str.charAt(i);
      }
    } else {
        result += str.charAt(i);
    }
  }
  
  return result;
}