public int withoutDoubles(int die1, int die2, boolean noDoubles) {
  if (noDoubles) {
    if (die1 == die2) {
      return die1 % 6 + die2 + 1;
    } else {
      return die1 + die2;
    }
  }
  return die1 + die2;
}
