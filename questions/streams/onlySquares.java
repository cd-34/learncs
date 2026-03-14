List<Shape> onlySquares(List<Shape> list) {
    return list.stream()
        .filter(s -> s instanceof Rectangle 
            && ((Rectangle) s).getWidth() == ((Rectangle) s).getHeight())
        .collect(Collectors.toList());
}