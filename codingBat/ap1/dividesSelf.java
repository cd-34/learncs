public boolean dividesSelf(int n) {
  int whole = n;
  while (whole > 0) {
    int temp = whole % 10;
    if (temp == 0) {
      return false;
    }
    if (n % temp != 0) {
      return false;
    }
    whole = whole / 10;
  }
  return true;
}
