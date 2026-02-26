int countOddDigits(int n) {
    // base case
    if (n == 0) {
        return 0;
    }
    // get the last digit and use Math.abs to convert negative > positive
    int lastDigit = Math.abs(n % 10);
    int count = 0;
    
    if (lastDigit % 2 != 0) {
        count++;
    }

    return count + countoddDigits(n / 10);
}

// more readable method without using count
int countOddDigits(int n) {
    if (n == 0) {
        return 0;
    }
    
    int lastDigit = Math.abs(n % 10);
    
    if (lastDigit % 2 != 0) {
        return 1 + countOddDigits(n / 10);
    }

    return countoddDigits(n / 10);
}