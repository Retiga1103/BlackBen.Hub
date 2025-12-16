import java.util.Scanner;

/**
 * The Tom class represents a virtual pet named Tom.
 * <p>
 * Tom is a simple interactive pet that can talk and laugh.
 * He repeats what the user says and responds with laughter.
 * </p>
 */
public class Tom implements Pet {

    /** The name of the pet */
    private String name;

    /**
     * Constructs a new Tom pet with the given name.
     *
     * @param name the name given to Tom
     */
    public Tom(String name) {
        this.name = name;
    }

    /**
     * Displays Tom's interaction menu and processes user commands.
     * <p>
     * The user can talk to Tom, make him laugh, or quit interaction.
     * </p>
     */
    @Override
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        String command = "";

        System.out.println("You adopted Tom! Commands: talk, laugh, quit");

        while (!command.equals("quit")) {
            System.out.print("Please enter a command > ");
            command = scanner.nextLine().toLowerCase();

            if (command.equals("talk")) {
                talk();
            } else if (command.equals("laugh")) {
                laugh();
            } else if (!command.equals("quit")) {
                System.out.println("Unknown command.");
            }
        }

        System.out.println("Goodbye from Tom!");
    }

    /**
     * Allows the user to talk to Tom.
     * <p>
     * Tom repeats whatever the user says.
     * </p>
     */
    public void talk() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Say something to Tom: ");
        String userInput = scanner.nextLine();
        System.out.println(name + " repeats: \"" + userInput + "\"");
    }

    /**
     * Makes Tom laugh.
     */
    public void laugh() {
        System.out.println(name + " laughs: hahaha!");
    }
}
