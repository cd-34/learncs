// there's definitely a better way to do this with Math.max and Math.min
public boolean evenlySpaced(int a, int b, int c) {
  int max = Math.max(a, Math.max(b, c));
  int min = Math.min(a, Math.min(b, c));
  int mid = a + b + c - max - min;
  
  return (mid - min) == (max - mid);
}

// my ugly first attempt
public boolean evenlySpaced(int a, int b, int c) {
  int ab = Math.abs(a - b);
  int ac = Math.abs(a - c);
  int bc = Math.abs(b - c);
  int equals = 0;
  if (ab == 0) {
    equals++;
  } 
  if (ac == 0) {
    equals++;
  }
  if (bc == 0) {
    equals++;
  }
  if (equals == 1) {
    return false;
  }
  return (ab == bc || ac == ab || bc == ac);
}
