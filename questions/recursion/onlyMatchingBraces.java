boolean onlyMatchingBraces(String characters) {
    if (characters.length() % 2 != 0) {
        return false;
    }

    if (characters.length() == 0) {
        return true;
    }

    if (characters.charAt(0) == '{' && characters.charAt(characters.length() - 1) == '}') {
        return onlyMatchingBraces(characters.substring(1, characters.length() - 1));
    } else {
        return false;
    }
}