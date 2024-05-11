/**
 * This is the third task.
 */
public class FindWordsContaining {
    /**
     * This is the main method that prints the strings that contains a specific char.
     * @param args as an array of strings.
     */
    public static void main(String[] args) {
        if (args[args.length - 1].length() > 1 || args.length <= 2) {
            System.out.println("Invalid input");
        } else {
            for (int i = 0; i < args.length - 1; i++) {
                if (args[i].contains(args[args.length - 1])) {
                    System.out.println(args[i]);
                }
            }
        }
    }
}

