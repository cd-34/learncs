/*
convert everything to strlowercase first
need to make sure i dont get out of bounds error
if alength = blength -> return if equal
if alength > blength -> return if a.substring(alength - blength).equals(b)
*/

public boolean endOther(String a, String b) {
  a = a.toLowerCase();
  b = b.toLowerCase();
  int len = a.length() - b.length();
  // a longer than b
  if (len > 0) {
    return (a.substring(len).equals(b));
  } else {
    return (b.substring(b.length() - a.length()).equals(a));
  }
}
