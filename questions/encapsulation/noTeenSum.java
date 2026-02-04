private int fixTeen(int value) {
    if (value == 13 || value == 14 || value == 17 || value == 18 || value == 19) {
        return 0;
    } else {
    return value;
    }
}

int noTeenSum(int first, int second, int third) {
    return fixTeen(first) + fixTeen(second) + fixTeen(third);
}