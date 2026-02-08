public class FozzBuzz {
    public static void fozzbuzz() {
        for (int i = 1; i <= 124; i++) {
            if (i % 6 == 0) {
                System.out.println("FozzBuzz");
            } else if (i % 2 == 0) {
                System.out.println("Fozz");
            } else if (i % 3 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}