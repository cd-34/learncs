public boolean loneTeen(int a, int b) {
  return ((a >= 13 && a <= 19) && (b < 13 || b > 19))
    || ((b >= 13 && b <= 19) && (a < 13 || a > 19));
}


/* 
Website solution
Cleans it up by using boolean local vars

public boolean loneTeen(int a, int b) {
  // Store teen-ness in boolean local vars first. Boolean local
  // vars like this are a little rare, but here they work great.
  boolean aTeen = (a >= 13 && a <= 19);
  boolean bTeen = (b >= 13 && b <= 19);
  
  return (aTeen && !bTeen) || (!aTeen && bTeen);
*/