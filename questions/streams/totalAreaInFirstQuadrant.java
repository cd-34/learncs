double totalAreaInFirstQuadrant(List<Shape> list) {
    return list.stream()
        .filter(s -> s.getCenterX() >= 0 && s.getCenterY() >= 0)
        .mapToDouble(Shape::getArea)
        // .mapToDouble(s -> s.getArea())
        .sum();
}