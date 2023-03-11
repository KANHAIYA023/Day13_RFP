package Com.Day13_RFP;

public class Refactor1 {
    public static <E extends Comparable<E>> E maxim(E x, E y, E z) {   //creating generic method
        E max = x;

        if (y.compareTo(max) > 0){
            max = y;
        }
        if (z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.printf("Maximum of %d, %d and %d is: %d", 10, 20, 15, maxim(10, 20, 15));
        System.out.println();

        System.out.printf("Maximum of %.1f, %.1f and %.1f is: %.1f", 5.5, 8.5, 6.5, maxim(5.5,
                8.5, 6.5));
        System.out.println();

        System.out.printf("Maximum of %s, %s and %s is: %s", "apple", "peach", "banana", maxim(
                "apple", "peach", "banana"));
        System.out.println();
    }
}
