public int userCompare(String aName, int aId, String bName, int bId) {
  int value = aName.compareTo(bName);
  if (value == 0) {
    if (aId == bId) {
      return 0;
    } else if (aId > bId) {
      return 1;
    } else {
      return -1;
    }
  }
  if (value > 0) {
    return 1;
  } else {
    return -1;
  }
}
