public int close10(int a, int b) {
  if (Math.abs(10 - a) == Math.abs(10 - b)) {
    return 0;
  } 
  if (Math.abs(10 - a) < Math.abs(10 - b)) {
    return a;
  } else {
    return b;
  }
}

// should use variables like website solution to keep code clean
/*
public int close10(int a, int b) {
  int aDiff = Math.abs(a - 10);
  int bDiff = Math.abs(b - 10);
  
  if (aDiff < bDiff) {
    return a;
  }
  if (bDiff < aDiff) {
    return b;
  }
  return 0;  // i.e. aDiff == bDiff
*/