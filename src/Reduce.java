public class Reduce {
    public static void main(String[] args) {
        reduceNumber(100);
    }

    private static void reduceNumber(int i) {
        while (i != 0) {
            // Find out which numbers divide i.
            boolean isEven = i % 2 == 0;

            if (isEven) {
                i /= 2;
                System.out.println(i);
            }else{
                i -= 1;
                System.out.println(i);
            }
        }
    }
}
