/**
 * This is the first task.
 */
public class SumOfInteger {
    /**
     * This is a class that calculate a sum of a number's integers.
     * @param n as a number.
     * @return the sum of its integers recursively.
     */
    public static int sumOfIntegersFunc(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfIntegersFunc(n / 10);
    }
    /**
     * This is the main method that calls the calculation method and prints the result.
     * @param args as an array of string
     */
    public static void main(String[] args) {
            try {
                int n = Integer.parseInt(args[0]);
                System.out.println(sumOfIntegersFunc(n));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
    }
}