package Com.Day13_RFP;

public class TC2 {
    public static <T extends Comparable<T>> T maximum(T x,T y, T z){
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }

        return max;
    }
    public static void main(String[] args) {
        //max number is 2nd position
        System.out.printf("Maximum of %d, %d and %d is %d", 15, 20, 10, maximum(15, 20, 10));
    }
}
