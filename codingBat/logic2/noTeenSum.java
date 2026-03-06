public int noTeenSum(int a, int b, int c) {
  return (fixTeen(a) + fixTeen(b) + fixTeen(c));
}

public int fixTeen(int n) {
  // takes in an int value and 
  // returns that value fixed for the teen rule
  if (n == 13 || n == 14 || n == 17 || n == 18 || n == 19) {
    n = 0;
  }
  return n;
}