int countMatchingNeighbors(String phrase) {
    // base case of string.length() == 1 (odd length) -> return 0
    // base case of string.length() == 0 (even length) -> return 0
    // what happens when string.length() == 2? -> also return 0
    if (phrase == null || phrase.length() < 3) {
        return 0;
    }

    if (phrase.charAt(0) == phrase.charAt(2)) {
        return 1 + countMatchingNeighbors(phrase.substring(1));
    }
    return countMatchingNeighbors(phrase.substring(1));
}