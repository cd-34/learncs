public boolean shareDigit(int a, int b) {
  int leftA = a / 10;
  int rightA = a % 10;
  int leftB = b / 10;
  int rightB = b % 10;
  
  return leftA == leftB || leftA == rightB || rightA == leftB || rightA == rightB;
}