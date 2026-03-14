List<String> doubleUp(List<String> list) {
    return list.stream()
        .map(s -> s + s)
        .collect(Collectors.toList());
}