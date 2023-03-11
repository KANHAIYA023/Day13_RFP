package Com.Day13_RFP;

public class TC3 {
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
        //max number is 3rd position
        System.out.printf("Maximum of %d, %d and %d is %d", 15, 10, 30, maximum(15, 10, 30));
    }
}
