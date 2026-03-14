double totalArea(List<Shape> shapes) {
    return shapes.stream()
        .mapToDouble(Shape::getArea)
        .sum();
}