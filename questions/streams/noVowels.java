List<String> noVowels(List<String> list) {
    return list.stream()
        .map(s -> s.replaceAll("[aeiouAEIOU]", "-"))
        .collect(Collectors.toList());
}