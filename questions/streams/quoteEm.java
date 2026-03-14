List<String> quoteEm(List<String> list) {
    return list.stream()
        .map(s -> "\"" + s + "\"")
        .collect(Collectors.toList());
}