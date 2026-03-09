public String[] fizzBuzz(int start, int end) {
  String[] array = new String[end - start];
  for (int i = 0; i < array.length; i++) {
    if (start % 15 == 0) {
      array[i] = "FizzBuzz";
      start++;
    } else if (start % 5 == 0) {
      array[i] = "Buzz";
      start++;
    } else if (start % 3 == 0) {
      array[i] = "Fizz";
      start++;
    } else {
      array[i] = String.valueOf(start);
      start++;
    }
  }
  return array;
}
