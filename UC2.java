package Com.Day13_RFP;

public class UC2 {
    public static <E extends Comparable<E>> E maximum(E x, E y, E z) {
        E max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }

        return max;
    }
    public static void main(String[] args) {
        System.out.printf("Maximum of %f, %f and %f is %f", 9.5, 4.24, 3.33, maximum(9.5, 4.24, 3.33));
    }
}
