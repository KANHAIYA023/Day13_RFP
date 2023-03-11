package Com.Day13_RFP;

public class UC1{
    public static <E extends Comparable<E>> E maximum(E x, E y, E z) {
        E max = x; //  x is initial the largest

        if (y.compareTo(max) > 0) {
            max = y; // y is the largest
        }

        if (z.compareTo(max) > 0) {
            max = z; // z is the largest
        }

        return max; // returns the largest object
    }

    public static void main(String[] args) {
        System.out.printf("Maximum of %d, %d and %d is %d", 9, 4, 3, maximum(9, 4, 3));
    }
}
