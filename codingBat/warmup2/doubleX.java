boolean doubleX(String str) {
  for (int i = 0; i < str.length() - 1; i++) {
    if (str.charAt(i) == 'x') {
      if (str.charAt(i + 1) == 'x') {
        return true;
      } else {
        return false;
      }
    }
  }
  return false;
}

// website uses a solution using str.indexOf 
// and an alternate solution using startsWith()