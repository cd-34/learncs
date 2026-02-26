List<String> doubleUpper(List<String> input) {
    // base case
    if (input.isEmpty()) {
        return new ArrayList<>();
    }

    // concatenate the list with itself at .get(0)
    String one = input.get(0);
    String doubled = one + one;

    // need to add this to a new list
    List<String> result = new ArrayList<>();
    result.add(doubled);

    // now need to reduce size of the list by one
    // also need to return list<string> result
    result.addAll(doubleUpper(input.subList(1, input.size())));
    return result;
}