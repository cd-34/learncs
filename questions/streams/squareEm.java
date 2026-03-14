List<Integer> squareEm(List<Integer> list) {
    return list.stream()
        .map(s -> s * s)
        .collect(Collectors.toList());
}