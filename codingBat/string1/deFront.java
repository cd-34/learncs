public String deFront(String str) {    
  String result = "";
  if (str.charAt(0) == 'a') {
    result += "a";
  }
  if (str.charAt(1) == 'b') {
    result += "b";
  }
  return result + str.substring(2);
}
