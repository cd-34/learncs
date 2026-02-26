String removeRepeats(String phrase) {
    // base case if string.length <= 1
    if (phrase.length() <= 1) {
        return phrase;
    }
    // grab the char
    String result = phrase.charAt(0) + "";

    if (phrase.charAt(1) == phrase.charAt(0)) {
        return result + removeRepeats(phrase.substring(2)); 
    } else {
        return result + removeRepeats(phrase.substring(1));
    }
}