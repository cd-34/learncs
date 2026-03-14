List<Integer> nearestWhole(List<Double> list) {
    return list.stream()
        .map(s -> (int) Math.round(s))
        .ecollect(Collectors.toList());
}