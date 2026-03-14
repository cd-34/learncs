List<String> doubleUpNull(List<String> list) {
    if (list == null) {
        return null;
    }

    return list.stream()
        // .map(s -> s == null ? null : s + s)
        .map(s -> {
            if (s == null) {
                return null;
            }
            return s + s;
        })
        .collect(Collectors.toList());
}