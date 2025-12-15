import java.util.Scanner;

/**
 * Represents the virtual pet Ben with a special science lab ability.
 */
public class Ben implements Pet {
    private String name;

    /**
     * Constructs a Ben pet with the given name.
     * @param name The name of the pet
     */
    public Ben(String name) {
        this.name = name;
    }

    /**
     * Displays the main menu for interacting with Ben.
     * Commands: science, quit
     */
    @Override
    public void menu() {
        System.out.println("You adopted Ben! Type 'science' to begin or 'quit' to stop.");
        Scanner scanner = new Scanner(System.in);
        String command = "";

        while (!command.equals("quit")) {
            System.out.print("> ");
            command = scanner.nextLine().trim().toLowerCase();

            if (command.equals("science")) {
                science();
            } else if (!command.equals("quit")) {
                System.out.println("Unknown command. Try 'science' or 'quit'.");
            }
        }

        System.out.println("Ben leaves the lab!");
    }

    /**
     * Launches Ben's science lab where the user can mix two potions.
     */
    public void science() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SCIENCE LAB ===");
        System.out.println("Pick two potions to mix:");
        System.out.println("red, green, blue, yellow, orange, purple");

        System.out.print("Enter first color: ");
        String c1 = scanner.nextLine().trim();

        System.out.print("Enter second color: ");
        String c2 = scanner.nextLine().trim();

        String result = makePotion(c1, c2);
        System.out.println(result);
    }

    /**
     * Combines two potion colors and returns the resulting effect.
     * @param a First color
     * @param b Second color
     * @return Description of the result
     */
    public String makePotion(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (!isValid(a) || !isValid(b)) {
            return "Invalid colors! Use: red, green, blue, yellow, orange, purple.";
        }

        if (a.equals("red") && b.equals("blue")) return "Result: BEN TURNS BLACK!";
        if (a.equals("red") && b.equals("green")) return "Result: VOLCANO ERUPTS!";
        if (a.equals("red") && b.equals("yellow")) return "Result: BEN TURNS BLACK!";
        if (a.equals("red") && b.equals("orange")) return "Result: VOLCANO ERUPTS!";
        if (a.equals("red") && b.equals("purple")) return "Result: BEN TURNS BLACK!";
        if (a.equals("red") && b.equals("red")) return "Result: VOLCANO ERUPTS!";

        if (a.equals("green") && b.equals("red")) return "Result: BEN TURNS BLACK!";
        if (a.equals("green") && b.equals("blue")) return "Result: VOLCANO ERUPTS!";
        if (a.equals("green") && b.equals("yellow")) return "Result: BEN TURNS BLACK!";
        if (a.equals("green") && b.equals("orange")) return "Result: VOLCANO ERUPTS!";
        if (a.equals("green") && b.equals("purple")) return "Result: BEN TURNS BLACK!";
        if (a.equals("green") && b.equals("green")) return "Result: BEN TURNS BLACK!";

        if (a.equals("blue") && b.equals("red")) return "Result: VOLCANO ERUPTS!";
        if (a.equals("blue") && b.equals("green")) return "Result: BEN TURNS BLACK!";
        if (a.equals("blue") && b.equals("yellow")) return "Result: VOLCANO ERUPTS!";
        if (a.equals("blue") && b.equals("orange")) return "Result: BEN TURNS BLACK!";
        if (a.equals("blue") && b.equals("purple")) return "Result: VOLCANO ERUPTS!";
        if (a.equals("blue") && b.equals("blue")) return "Result: BEN TURNS BLACK!";

        if (a.equals("yellow") && b.equals("red")) return "Result: BEN TURNS BLACK!";
        if (a.equals("yellow") && b.equals("green")) return "Result: VOLCANO ERUPTS!";
        if (a.equals("yellow") && b.equals("blue")) return "Result: BEN TURNS BLACK!";
        if (a.equals("yellow") && b.equals("orange")) return "Result: VOLCANO ERUPTS!";
        if (a.equals("yellow") && b.equals("purple")) return "Result: BEN TURNS BLACK!";
        if (a.equals("yellow") && b.equals("yellow")) return "Result: VOLCANO ERUPTS!";

        if (a.equals("orange") && b.equals("red")) return "Result: VOLCANO ERUPTS!";
        if (a.equals("orange") && b.equals("green")) return "Result: BEN TURNS BLACK!";
        if (a.equals("orange") && b.equals("blue")) return "Result: VOLCANO ERUPTS!";
        if (a.equals("orange") && b.equals("yellow")) return "Result: BEN TURNS BLACK!";
        if (a.equals("orange") && b.equals("purple")) return "Result: VOLCANO ERUPTS!";
        if (a.equals("orange") && b.equals("orange")) return "Result: BEN TURNS BLACK!";

        if (a.equals("purple") && b.equals("red")) return "Result: BEN TURNS BLACK!";
        if (a.equals("purple") && b.equals("green")) return "Result: VOLCANO ERUPTS!";
        if (a.equals("purple") && b.equals("blue")) return "Result: BEN TURNS BLACK!";
        if (a.equals("purple") && b.equals("yellow")) return "Result: VOLCANO ERUPTS!";
        if (a.equals("purple") && b.equals("orange")) return "Result: BEN TURNS BLACK!";
        if (a.equals("purple") && b.equals("purple")) return "Result: VOLCANO ERUPTS!";

        return "Unexpected mixture!";
    }

    /**
     * Checks if the provided color is valid for mixing.
     * @param c The color to check
     * @return True if valid, false otherwise
     */
    private boolean isValid(String c) {
        c = c.toLowerCase();
        return c.equals("red") || c.equals("green") || c.equals("blue") ||
               c.equals("yellow") || c.equals("orange") || c.equals("purple");
    }
}
