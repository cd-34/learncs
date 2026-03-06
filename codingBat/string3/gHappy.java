public boolean gHappy(String str) {
  for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) == 'g') {
      // true if previous char is g
      boolean left = (i > 0 && str.charAt(i - 1) == 'g');
      // true if next char is g
      boolean right = (i < str.length() - 1 && str.charAt(i + 1) == 'g');
      if (!left && !right) {
        return false;
      }
    }
  }
  return true;
}

// System.out.println(gHappy("xxggxx"));