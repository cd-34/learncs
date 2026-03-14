List<Integer> noOddAndSquareNegs(List<Integer> list) {
    return list.stream()
        .filter(s -> s % 2 == 0)
        .map (s -> s < 0 ? s * s : s) 
        .collect(Collectors.toList());
}