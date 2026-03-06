public int sumLimit(int a, int b) {
  int sum = a + b;
  String stringA = String.valueOf(a);
  String stringSum = String.valueOf(sum);
  
  if (stringA.length() == stringSum.length()) {
    return sum;
  }
  return a;
}
