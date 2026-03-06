public boolean in1To10(int n, boolean outsideMode) {
  if ((!outsideMode && int >= 1 && int <= 10)
    || outsideMode && (int <= 1 || int >= 10)) {
    return true;
  }
  return false;
}
