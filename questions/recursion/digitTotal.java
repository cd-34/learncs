int digitTotal(int inputN) {
    if (inputN == 0) {
        return 0;
    }

    int lastDigit = Math.abs(inputN % 10);
    return lastDigit + digitTotal(inputN / 10);
}