package Com.Day13_RFP;

public class UC3 {
    public static <E> String GenericMethod(String x, String y, String z){
        String max = x;
        if (y.compareTo(max)>0){
            max = y;
        }
        if (z.compareTo(max)>0){
            max = z;
        }return max;
    }
    public static void main(String[] args) {
        String x = "aman";
        String y = "ahal";
        String z = "aarun";
        String gm = GenericMethod(x,y,z);
        System.out.println("largest String is: " + gm);
    }
}
