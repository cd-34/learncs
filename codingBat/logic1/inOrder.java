public boolean inOrder(int a, int b, int c, boolean bOk) {
  if (bOk && c > b) {
    return true;
  } 
  if (c > b && b > a) {
    return true;
  }
  return false;
}
