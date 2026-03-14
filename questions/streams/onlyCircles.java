List<Shape> onlyCircles(List<Shape> list) {
    return list.stream()
        .filter(s -> s instanceof Circle)
        .collect(Collectors.toList());
}