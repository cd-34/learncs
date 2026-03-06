public int caughtSpeeding(int speed, boolean isBirthday) {
  if ((speed <= 60 && !isBirthday) || (speed <= 65 && isBirthday)) {
    return 0;
  }
  if ((speed <= 80 && !isBirthday) || (speed <= 85 && isBirthday)) {
    return 1;
  }
  return 2;
}
