public boolean makeBricks(int small, int big, int goal) {
  if ((goal - (big * 5) - small) > 0) {
    return false;
  }
  if ((goal % 5) - small > 0) {
    return false;
  }
  return true;
}
