List<Integer> noOdd(List<Integer> list) {
    return list.stream()
        .filter(e -> e % 2 == 0)
        .collect(Collectors.toList());
}