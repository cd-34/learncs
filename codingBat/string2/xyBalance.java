// if x appears
// check if y after

public boolean xyBalance(String str) {
  boolean balanced = true;
  for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) == 'x') {
      balanced = false;
    }
    if (str.charAt(i) == 'y') {
      balanced = true;
    }
  }
  return balanced;
}
