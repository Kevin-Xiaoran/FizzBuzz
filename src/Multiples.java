public class Multiples {
    public static void main(String[] args) {
        findNumbers();
    }

    private static void findNumbers() {
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 || divisibleBy5) {
                count++;
            }
        }

        System.out.println(count);
    }
}
