public String[] mergeTwo(String[] a, String[] b, int n) {
  String[] array = new String[n];
  int i = 0;
  int j = 0;
  for (int k = 0; k < array.length; k++) {
    if (a[i].compareTo(b[j]) < 0) {
      array[k] = a[i];
      i++;
    } else if (a[i].compareTo(b[j]) > 0) {
      array[k] = b[j];
      j++;
    } else { // what if same
      array[k] = a[i];
      i++;
      j++;
    }
  }
  return array;
}
