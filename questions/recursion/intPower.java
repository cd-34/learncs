double intPower(double x, int n) {
    if (n < 0) {
        throw new IllegalArgumentException();
    }

    if (n == 0) {
        return 1;
    }

    return x * intPower(x, n - 1);
}