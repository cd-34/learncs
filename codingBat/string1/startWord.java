public String startWord(String str, String word) {
  int strLength = str.length();
  int wordLength = word.length();
  String wrd = word.substring(1);
  if (strLength < wordLength) {
    return "";
  }
  if (str.substring(1, wordLength).equals(wrd)) {
    return "" + str.charAt(0) + wrd;
  }
  return "";
}
