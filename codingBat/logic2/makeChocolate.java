public int makeChocolate(int small, int big, int goal) {
  // max number of bars we can use
  int div5 = goal / 5;
  // how many big bars we used
  int bigUsed = Math.min(big, div5);
  // how many small bars we need to use
  int remaining = goal - (bigUsed * 5);
  
  if (small >= remaining) {
    return remaining;
  }
  return -1;
}
