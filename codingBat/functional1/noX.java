public List<String> noX(List<String> strings) {
  strings.replaceAll(str -> str.replace("x", ""));
  return strings;
}

// public List<String> noX(List<String> strings) {
//   List<String> result = new ArrayList<>();
  
//   for (String s : strings) {
//     String noX = "";
//     for (int i = 0; i < s.length(); i++) {
//       if (s.charAt(i) != 'x') {
//         noX += s.charAt(i);
//       }
//     }
//     result.add(noX);
//   }
//   return result;
// }
