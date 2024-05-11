/**
 * This is the second task.
 */
public class CountPairs {
    /**
     * This is the main method. It checks the numbers of pairs that theirs summary is less than target number.
     * @param args as an array of string.
     */
    public static void main(String[] args) {
        if (args.length <= 2) {
            System.out.println("Invalid input");
        } else {
        int counter = 0;
        for (int i = 0; i < args.length - 1; i++) {
            for (int j = i + 1; j < args.length - 1; j++) {
                if (Integer.parseInt(args[i]) + Integer.parseInt(args[j]) < Integer.parseInt(args[args.length - 1])) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
        }
    }
}