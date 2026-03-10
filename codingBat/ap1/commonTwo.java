public int commonTwo(String[] a, String[] b) {
  int count = 0;
  int indexa = 0;
  int indexb = 0;
  String last = "";
  while (indexa < a.length && indexb < b.length) {
    if (a[indexa].equals(b[indexb])) {
      if (!a[indexa].equals(last)) {
        count++;
        last = a[indexa];
      }
      indexa++;
      indexb++;
    } else if (a[indexa].compareTo(b[indexb]) < 0) {
      indexa++;
    } else {
      indexb++;
    }
  }
  return count;
}
